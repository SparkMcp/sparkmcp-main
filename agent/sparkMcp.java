sparkmcp/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── sparkmcp/
│   │   │           ├── core/
│   │   │           │   ├── SparkMcpSession.java
│   │   │           │   ├── SparkMcpContext.java
│   │   │           │   └── config/
│   │   │           │       └── SparkMcpConfig.java
│   │   │           ├── model/
│   │   │           │   ├── ModelRegistry.java
│   │   │           │   └── PredictiveModel.java
│   │   │           ├── connect/
│   │   │           │   ├── DataConnector.java
│   │   │           │   ├── SqlProcessor.java
│   │   │           │   └── connectors/
│   │   │           │       ├── KafkaConnector.java
│   │   │           │       └── JdbcConnector.java
│   │   │           ├── process/
│   │   │           │   ├── HotDataProcessor.java
│   │   │           │   ├── ColdDataProcessor.java
│   │   │           │   └── DataTemperatureManager.java
│   │   │           └── plugins/
│   │   │               ├── McpPlugin.java
│   │   │               └── PluginRegistry.java
│   │   └── resources/
│   │       └── log4j.properties
│   └── test/
│       └── java/
│           └── com/
│               └── sparkmcp/
│                   └── core/
│                       └── SparkMcpSessionTest.java
├── examples/
│   ├── simple-analytics/
│   │   └── SimpleAnalyticsExample.java
│   └── custom-plugin/
│       └── CustomPluginExample.java
├── pom.xml
├── LICENSE
└── README.md