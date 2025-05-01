public class MyCustomMcpPlugin implements McpPlugin {
    @Override
    public void initialize(SparkMcpContext context) {
        // Plugin initialization logic
    }
    
    @Override
    public void processHotData(DataFrame data) {
        // Real-time processing logic
    }
    
    @Override
    public void processColdData(DataFrame data) {
        // Batch processing for historical data
    }
}