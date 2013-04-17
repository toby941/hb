<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="http://open.web.meitu.com/sources/xiuxiu.js" type="text/javascript"></script>
<script type="text/javascript">
window.onload=function(){
  xiuxiu.embedSWF("altContent",3,"100%","100%");
  /*第1个参数是加载编辑器div容器，第2个参数是编辑器类型，第3个参数是div容器宽，第4个参数是div容器高*/
  xiuxiu.setUploadURL("http://imgkaka.meitu.com/picsave.php");//修改为上传接收图片程序地址
  xiuxiu.onInit = function ()
  {
    xiuxiu.loadPhoto("http://open.web.meitu.com/sources/images/1.jpg");//修改为要处理的图片url
  }
  xiuxiu.onUploadResponse = function (data)
  {
    //alert("上传响应" + data); 可以开启调试
  }
}
</script>
<style type="text/css">
	html, body { height:90%; overflow:hidden; }
	body { margin:10; }
</style>
<div id="altContent">
	<h1>美图秀秀</h1>
</div>