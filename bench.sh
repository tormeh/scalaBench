scalac -optimise bench.scala && time --verbose scala -J-server -J-XX:+UseConcMarkSweepGC -J-Xmx4g -J-Xms4g Bench
