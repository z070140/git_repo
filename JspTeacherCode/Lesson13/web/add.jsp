<%@ page language="java"  pageEncoding="UTF-8"%>
<html>
  <head>
    <title>添加留言</title>
  </head>
  <script language="javascript">
 function isok(){
  if   (form1.author.value=='')   
           {   
                       window.alert("作者不能为空，请重输！");   
                       form1.author.focus();   
                      return   false;   
          }  
  if   (form1.content.value=='')   
           {   
                       window.alert("内容不能为空，请重输！");   
                       form1.content.focus();   
                      return   false;   
          }  

  return  true; 
 }
</script>
  <body>
  <form name="form1" method="post" action="add.do" onSubmit="return isok();">
      <table width="487" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
        <tr>
          <td colspan="2" bgcolor="#FFFFFF">&nbsp;</td>
        </tr>
        <tr>
          <td width="73" bgcolor="#FFFFFF">作者:</td>
          <td width="411" bgcolor="#FFFFFF"><input type="text" name="author"></td>
        </tr>
        <tr>
          <td bgcolor="#FFFFFF">内容:</td>
          <td bgcolor="#FFFFFF"><textarea name="content" cols="40" rows="15"></textarea></td>
        </tr>
        <tr>
          <td bgcolor="#FFFFFF">&nbsp;</td>
          <td bgcolor="#FFFFFF"><input type="submit" name="Submit" value="添加">
</td>
        </tr>
    </table>
  </form>
  </body>
</html>
