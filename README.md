本代码为知乎专栏：https://zhuanlan.zhihu.com/p/102166413 的示例代码

为了隐私安全，我隐藏了AWS的access key和secret key，要想代码可以运行，必须要自己新建DynamoDB的数据库

修改src/main/resources/application-template.properties为application-template.properties，并且填写自己的access key和secret key

同时，GSI查询必须建立在GSI已经建立好了的情况，否则代码可能运行失败。

GSI建立方式文中有大致步骤