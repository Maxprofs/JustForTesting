<h2 class="title"> 99 Mutiplication Table</h2>
           <section class="st">
               <script>
                   document.write("<table class='st1' style='color:#ff6666;width:auto;border:1px solid #3399ff;background-color:#3399ff;padding:2px;'>");
                   document.write("<tr>");
                   for (var i = 2; i <= 9; i++) {
                       document.write("<td style='border:1px solid #b3e6ff;background-color:#b3e6ff;padding:2px;'>");
                       for (var j = 1; j <= 9; j++) {
                           document.write(i + " * " + j + " = " + ("0" + i * j).slice(-2) + "<br>");
}
}
                   document.write("<tr>");
                   document.write("</table>");
               </script>
           </section>