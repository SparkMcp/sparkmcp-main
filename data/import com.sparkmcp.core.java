import com.sparkmcp.core.SparkMcpSession;
import com.sparkmcp.plugins.McpPlugin;

// Initialize SparkMcp session
SparkMcpSession session = SparkMcpSession.builder()
    .appName("MyDataAnalytics")
    .enableHotProcessing(true)
    .coldStoragePath("/data/cold-storage")
    .build();

// Register a custom MCP plugin
session.registerPlugin(new MyCustomMcpPlugin());

// Process streaming data with SQL
session.sql("SELECT sensor_id, avg(temperature) as avg_temp " +
            "FROM live_sensor_stream " +
            "GROUP BY sensor_id " +
            "HAVING avg_temp > 100")
       .writeToStream("high_temp_alerts");