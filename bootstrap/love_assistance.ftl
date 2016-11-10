<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0032)http://www.1yyg.com/list/m1.html -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<!-- viewport的<meta>标签，这个标签可以修改在大部分的移动设备上面的显示，为了确保适当的绘制和触屏缩放。-->
<title>爱心互助</title>
<!--样式文件引用-->
<#assign path="${request.getContextPath()}">
  <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.0/css/bootstrap-combined.min.css" rel="stylesheet">    
   <link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
   <link rel="stylesheet" type="text/css" href="${path}/WEB-INF/bootstrap/css/love_assistance.css"> 
   <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      
       <![endif]
<!--IE9以下的浏览器并不支持这些标签，也不能为这些标签进行添加样式。那么修复这个问题我们需要链接引用的文件
意思就是说如果用户IE浏览器的版本小于IE9，那么就会加载这两个js文件库，现在就可以使用这些新的标签，并且可以在这些标签上添加样式了
-->
 </head>
<body>
<div class='navbar navbar-inverse'>
     <div class='nav-collapse' style="height:50px; inline-block;">
          <ul class="nav">
               <li class=""><a href="#">健康资讯</a></li>
               <li class=" "><a href="#">爱心互助</a></li>
               <li class=" "><a href="#">健康投资</a></li>
               <li class=" "><a href="#">APP下载</a></li>
          </ul>
     </div>
</div>
<div class="container">
     <div class="row">
          <!-- ngRepeat: item in resultList -->
          <div class="col-md-3 col-sm-6" ng-repeat="item in resultList">
              <div class="course-item">
                 <div class="course-img">
                     <img src="./images/39project443large.png">
                      <a href="crowdfundingAction.html?id=0d4ab7ff-bd60-46d7-860a-2cdse1bad24">
                       <div class="mask">
                         <span class="btn btn-primary">开始众筹</span>
                       </div>
                       </a>
                 </div>
              </div>
              <div class="course-info">
                  <div class="title">
                      <a class="transition ng-binding" href="crowdfundingAction.html?id=0d4ab7ff-bd60-46d7-860a-2cdse1bad24">挖矿币（MiningCoin）第一期众筹</a>
                  </div>
                  <div class="metas ng-binding">
							         第一期爱心工程说明
							【1】爱心项目众筹总额：140万RMB；
							【2】爱心项目用途：用于贫困地区扶贫投资
							【3】爱心工程发起人：
                  </div>
                  <div class="teacher">
                      <span class="pull-left">已筹资:<strong class="ng-binding"><i class="fa fa-cny"></i>
                             350,000</strong></span>
                      <span class="pull-right">目标:<strong class="ng-binding"><i class="fa fa-cny"></i> 350,000</strong></span>
                  </div>
                  <div class="teacher" style="height: auto;">
                       <div class="progress" style="height: 12px; margin-bottom: 0px">
                           <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 100%;">
                           </div>
                       </div>
                  </div>
                  <div class="teacher">
                        <span class="pull-left ng-binding">100%</span>
                        <span class="pull-right">
                        <span class="ng-scope">
                        <span class="label label-success ng-scope">
                                已结束
                        </span>
                                      	
                        </span>
                        </span>
                  </div>
              </div>
          </div>
          <!-- ngRepeat: item in resultList -->
          <div class="col-md-3 col-sm-6" ng-repeat="item in resultList">
              <div class="course-item">
                  <div class="course-img">
                     <img src="./images/39project443large.png">
                     <a href="crowdfundingAction.html?id=0d4ab7ff-bd60-46d7-860a-2cdse1bad24">
                     <div class="mask">
                          <span class="btn btn-primary">开始众筹</span>
                     </div>
                     </a>
                  </div>
                  <div class="course-info">
                      <div class="title">
                          <a class="transition ng-binding" href="crowdfundingAction.html?id=0d4ab7ff-bd60-46d7-860a-2cdse1bad24">健康云第一期众筹</a>
                      </div>
                      <div class="metas ng-binding">
              							             第一期爱心工程说明
							【1】爱心项目众筹总额：140万RMB；
							【2】爱心项目用途：用于地区医疗设施建设
							【3】爱心工程发起人：
                      </div>
                      <div class="teacher">
                         <span class="pull-left">已筹资:<strong class="ng-binding"><i class="fa fa-cny"></i>
                                   350,000</strong></span>
                         <span class="pull-right">目标:<strong class="ng-binding"><i class="fa fa-cny"></i> 350,000</strong></span>
                      </div>
                      <div class="teacher" style="height: auto;">
                          <div class="progress" style="height: 12px; margin-bottom: 0px">
                               <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 100%;">
                               </div>
                          </div>
                      </div>
                      <div class="teacher">
                           <span class="pull-left ng-binding">100%</span>
                           <span class="pull-right">
                           <span class="ng-scope">
                           <span class="label label-success ng-scope">
                                         已结束
                           </span>

                           </span>
                           </span>
                      </div>
                  </div>
              </div>


          </div>

          <!-- ngRepeat: item in resultList -->
          <div class="col-md-3 col-sm-6" ng-repeat="item in resultList">
                 <div class="course-item">
                        <div class="course-img">
                            <img src="./images/39project443large.png">
                            <a href="crowdfundingAction.html?id=0d4ab7ff-bd60-46d7-860a-2cdse1bad24">
                                <div class="mask">
                                    <span class="btn btn-primary">开始众筹</span>
                                </div>
                            </a>
                        </div>
                    <div class="course-info">
                        <div class="title">
                           <a class="transition ng-binding" href="crowdfundingAction.html?id=0d4ab7ff-bd60-46d7-860a-2cdse1bad24">健康云第一期众筹 </a>
                        </div>
                        <div class="metas ng-binding">
                                                                                      第一期爱心工程说明
							【1】爱心项目众筹总额：140万RMB；
							【2】爱心项目用途：用于贫困地区扶贫投资
							【3】爱心工程发起人：
                        </div>
                        <div class="teacher">
                           <span class="pull-left">已筹资:<strong class="ng-binding"><i class="fa fa-cny"></i>
                              350,000</strong></span>
                           <span class="pull-right">目标:<strong class="ng-binding"><i class="fa fa-cny"></i> 350,000</strong></span>
                        </div>
                         <div class="teacher" style="height: auto;">
                             <div class="progress" style="height: 12px; margin-bottom: 0px">
                                 <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 100%;">
                                 </div>
                             </div>
                         </div>
                         <div class="teacher">
                             <span class="pull-left ng-binding">100%</span>
                             <span class="pull-right">
                             <span class="ng-scope">
                              <span class="label label-success ng-scope">
                                         已结束
                              </span>

                              </span>
                              </span>
                         </div>

                    </div>
                </div>
          </div>
</div>
<div class="container">
     <div class="insurance-entrance-bottom row">
     <div class=" index-masthead-center" span9>
     <h1 class="font-top">轻松筹—大病救助</h1>
     <p>事后救助·化险为夷</p>
     <a href="/publish/create/love/sick" class="btn  btn-primary">立刻求助</a>
     </div>
     <div>
     <p class="insurance-entrance-bottom-down">天有不测 生病时救助 爱心筹款救助平台&nbsp;&nbsp;&nbsp;&nbsp;获取额外补助求助者自行传播越努力越幸运</p>
     </div>
     </div>
</div>


<!--JavaScript插件都是依赖与jQuery库-->
 <script type="text/javascript" src="http://libs.baidu.com/jquery/2.0.0/jquery.js"></script>
 <script type="text/javascript" src="./js/bootstrap.min.js"></script>
 </body>
 </html>