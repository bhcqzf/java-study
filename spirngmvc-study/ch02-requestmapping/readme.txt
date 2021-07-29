ch02-requestmapping requestmapping的使用

需求：用户在页面发起一个请求，请求交给springmvc的控制器对象，并显示请求的处理结果（在结果页面显示一个欢迎语句）

实现步骤：
   1、新建web maven功能
   2、加入依赖
    spring-webmvc依赖，简介把spring的依赖加入到项目
    jsp，servlet依赖
   3、重点，在web,xml中猪草espringmvc框架的核心对象DispatherServlet
   1）DispatherServlet叫做中央调度器，是一个servlet，它的弗雷是集成httppServlet
   2）DispatherServlet也叫前端控制器（front controller）
   3）DispatherServlet负责接受用户提交的请求，调用其他的控制器对象，
            并把请求的处理结果显示给用户
  4、创建一个发起请求页面index.jsp

  5、创建控制器类
  1）在类的上面加入@Controller注解，创建对象，并放入到springmvc容器中
  2）在类中的方法上面加入@RequestMapping注解

  6、创建一个作为结果的jsp，显示请求的处理结果

  7、创建springmvc的配置文件（spring的配置文件一样）
    1）声明组建扫描器，指定@Controlller注解所在的包名
    2）声明驶入解析器，帮助处理视图的。