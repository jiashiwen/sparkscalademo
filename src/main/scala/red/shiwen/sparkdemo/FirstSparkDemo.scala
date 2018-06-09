package red.shiwen.sparkdemo

import org.apache.spark.{SparkConf, SparkContext}


object FirstSparkDemo {
  def main(args: Array[String]) {
    val inputFile =  "file:////home/develop/spark-2.3.0-bin-hadoop2.7/README.md"
    val conf = new SparkConf().setAppName("WordCount").setMaster("local")
    val sc = new SparkContext(conf)
    val textFile = sc.textFile(inputFile)
    val wordCount = textFile.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey((a, b) => a + b)
    wordCount.foreach(println)
  }
}
