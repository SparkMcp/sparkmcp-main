-- Create a view of streaming data
CREATE TEMPORARY VIEW sensor_data AS
SELECT * FROM kafka_stream("sensors");

-- Perform real-time analytics
SELECT 
  device_id,
  window_time,
  AVG(value) as avg_value,
  MAX(value) as max_value
FROM sensor_data
GROUP BY device_id, TUMBLE(timestamp, '5 minutes') as window_time;