# sparkscalademo

### 工程创建参考链接
https://zhuanlan.zhihu.com/p/32457114
https://yezhwi.github.io/bigdata/2017/12/28/Spark-HelloWorld/



* maven配置参考
https://github.com/apache/spark/blob/master/examples/pom.xml

### 本地提交测试
```$shell
./bin/spark-submit \
  --class red.shiwen.sparkdemo.FirstSparkDemo\
  --master local[2] \
  /home/develop/IdeaProjects/sparkscalademo/target/sparkscalademo-1.0-SNAPSHOT.jar 

```
