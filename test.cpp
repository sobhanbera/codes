<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>CONQUER</title>
    </head>
    <body>
        <style>
            body{
                height: 100vh;
                overflow-x: hidden;


            }
            .cf{
                background-color: rgb(30, 27, 42);
                list-style-type: none;
                margin: 0%;
                padding-left: 30%;
                border: 0;
                overflow: hidden;
                position:fixed;
                top:0;
                left:0;
                right:0;
            }
            li{
                float:left;
                padding: 10px 25px 10px;

            }

            .cf1, .cf2, .cf3, .cf4, .cf5{
                color: rgb(227, 222, 222);
                text-decoration: none;
                display:block;
                justify-content: center;
                text-align:center;
                font-family: cursive;
                left: 80px;
                border: 0.5px solid rgb(93, 93, 93);
                padding: 7px 10px 7px;

            }
            .cf1:hover, .cf2:hover, .cf3:hover, .cf4:hover, .cf5:hover{
                background-color: rgb(41, 37, 71);
            }
            h1, h3 {
                text-align: center;
                font-family: 'Courier New', Courier, monospace;
                color: #fff;
                text-shadow:rgb(30, 27, 42);
                box-sizing:content-box;
                }

            h2{
                color:black;
                text-align: center;
                font-family: 'Courier New', Courier, monospace;


            }
            .img1{
                padding: 180px 50px 180px;
                background-image: url("C:/Users/srush/OneDrive/Desktop/JS30/Practice/photo2.jpg")     ;
                background-attachment: local;
                margin: 0px 0px 0px -10px;

                background-repeat: no-repeat;
                background-size: cover;
                width: 100%;
                border-left-width: 0%;
                outline-width: 0px;
                position:initial;
                background-position:center;
            }

            .Ta1, .Ta2, .Ta3, .Ta4, .Ta5{
                background-color:rgb(227, 220, 220);
                color:rgb(71, 69, 69);
                padding: 9px;
                box-sizing: content-box;
                vertical-align:top;
                background-repeat: no-repeat;
                background-position: center;
                background-size: cover;
                background-attachment:  fixed ;
                border-radius: 0%;
                justify-items: center ;
                justify-content: center ;
                background-position: center ;
                text-align:center ;
                border: 20px solid #fff;
                width: 300px ;
                height: 200px  ;
            }



            .b3, .rd, .pl, .TCL, .TCR{
                font-size: large;
            }
            .b3{
                color: rgb(15, 158, 15);
            }
            .rd{
                color:rgb(0, 85, 255);
            }
            .pl{
                color:rgb(97, 95, 95);
            }

            .tab1{
                margin: 10px 100px 10px 220px ;

            }

            .tab2{
                margin: 10px 100px 10px 380px;
            }





            .td1{
                background-color:rgb(194, 188, 188);
                padding: 20px 40px 20px 40px;
                margin: 10px;
                border: 50px solid #fff;

                border-radius: 20% ;
            }

            .tabl{
                margin: 20px 90px 20px 90px;
            }

            .td11{
                background-color: rgb(194, 188, 188);
                padding:20px 40px 20px 40px;
                vertical-align: auto;
                margin: 0px 300px 0px 300px;
                border-radius:  4%      ;
            }

            .abc{
                text-align:center;
                padding: 20px;
                margin: 20px 450px 20px 450px;

            }
            input{
                padding: 7px 50px 7px 5px;
                margin: 5px 90px 5px 500px;
                border-radius: 2%;
                color:rgb(189, 189, 189);
            }

            textarea{
                padding: 20px 50px 20px 27px;
                margin: 2px 30px 0px 0px;

                border-radius: 5%  ;

                color:   rgb(106, 101, 101);
                border:   1.7px solid black;




            }

            button{
                background-color:black;
                color:#fff;
                border-radius:   7%;
                justify-content: center;
                text-align: center;
                margin: 20px 700px 30px 700px;


                font-size: medium ;

                padding:  7px 20px 7px 20px;

            }


            </style>
        <nav>
            <ul class = "cf">
                <li>
                    <a class = "cf1" href="#homepage">Homepage</a>
                </li>
                <li id =>
                    <a class = "cf2" href="#aboutus">About us</a>
                </li>
                <li>
                    <a class = "cf3" href="#services">Services</a>
                </li>
                <li>
                    <a class = "cf4" href="#contact">Contact</a>
                </li>
                <li>
                    <a class = "cf5" href="#external">External</a>
                </li>
            </ul>
        </nav>

        <div class= "img1"><div id= "cf11"><h1>CONQUER</h1></div>

        <h3>Simple Bootstrap template</h3></div><br><br>





        <h2 id ="cf12">About Us</h2>
        <table class="tab1">
            <tr >
                <td class="Ta1">
                    <img src="C:/Users/srush/OneDrive/Desktop/JS30/Practice/Ta1.jpg" width="300px" height="200px"><br>
                    <span class="b3"> <b>Bootstrap v3.3.6</b></span><br><br>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Optio cupiditate temporibus neque, reprehenderit aliquid perferendis doloremque unde molestiae sed voluptatibus facere quam officiis excepturi odit laborum maiores natus expedita mollitia!
                </td>
                <td class="Ta2">
                    <img src="C:/Users/srush/OneDrive/Desktop/JS30/Practice/Ta2.jpg" width="300px" height="200px"><br>
                    <span class="rd"><b>Responsive Design</b></span><br><br>
                Lorem ipsum dolor sit amet consectetur, adipisicing elit. Aut blanditiis ipsa deleniti accusamus impedit, voluptas id nostrum explicabo beatae sed illum rerum cumque, eos mollitia, quis ad. Sapiente, impedit libero.
                </td>
                <td class="Ta3">
                    <img src="C:/Users/srush/OneDrive/Desktop/JS30/Practice/Ta3.jpg" width="300px" height="200px"><br>
                    <span class="pl"><b>Parallax Layout</b></span><br><br>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. In vero quis eveniet voluptatibus, atque eligendi tenetur omnis reiciendis repudiandae itaque numquam blanditiis modi temporibus dolorem voluptatum corrupti eius quidem officia.
                </td>
            </tr>
        </table>
        <table class="tab2">
            <tr>
                <td class="Ta4">
                    <img src="C:/Users/srush/OneDrive/Desktop/JS30/Practice/Ta4.jpg" width="300px" height="200px"><br>
                    <span class="TCL"><b>Two Column Left Side</b></span><br><br>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Impedit asperiores deserunt consectetur, harum corrupti vel perspiciatis quaerat possimus vitae dolores minus. Ad velit rem laudantium iure veritatis ab, autem facere animi, tempora ipsa beatae, totam saepe est delectus sed. Molestiae?
                </td>
                <td class=" Ta5">
                    <img src="C:/Users/srush/OneDrive/Desktop/JS30/Practice/Ta5.jpg" width="300px" height="200px"><br>
                    <span class="TCR"><b>Two Column Right Side</b></span><br><br>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Molestias debitis odit voluptatibus ullam cum, aliquid dignissimos? Illum temporibus labore omnis aut eaque reiciendis, sit consequuntur iure? Tempora repellat voluptatibus maxime sit, quis, illo ratione possimus aut optio expedita aspernatur quam?
                </td>
            </tr>
        </table><br><br>


        <h2 id= "cf13"> Our Services</h2>
        <table class="tabl">
            <tr>
                <td class="td1">
                    <b>Column One</b><br><br>



                    Lorem ipsum dolor, sit amet consectetur adipisicing elit. Obcaecati ex ut labore odit ipsum temporibus, fugit libero quam reiciendis magnam.
                </td>
                <td class="td1"><b>Column Two</b><br><br>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptate aliquam magni unde recusandae, quam autem debitis? Beatae, fuga hic. Magnam!

                </td>
                <td class="td1"><b>Column Three</b><br><br>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Eum id in culpa, dolor perspiciatis molestiae voluptatem aperiam. Officia, consequuntur enim.

                </td>
                <td class="td1"><b>Column Four</b><br><br>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusamus officia minima, accusantium distinctio vero animi architecto repellat. Tempore, aliquid consequatur!
                </td>
            </tr>
        </table>
        <div class =  "td11"><b>One Big Column </b><br><br>
        Lorem, ipsum dolor sit amet consectetur adipisicing elit. Quaerat quos ullam unde hic rem minima vitae nihil in illum aliquid voluptas iure assumenda consectetur, pariatur velit autem alias iusto natus veritatis dolorum eius iste voluptatibus illo suscipit. Pariatur reiciendis, nostrum quis vero incidunt nam soluta fugiat assumenda adipisci omnis voluptatem.
        </div><br><br>
        <h2 id="cf14">Contact Form</h2>
        <p class="abc">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Incidunt suscipit officiis velit, cumque beatae nesciunt nemo sunt error et, illum odit delectus voluptas aut earum!</p><br>
        <table>
            <tr>
                <td>
        <input type="text" name="name" placeholder="name"><br>
        <input type="email" name="email" placeholder="email"><br>
        <input type="text" name="subject" placeholder="subject"><br></td>
        <td><textarea rows="5" cols="10">
            Your message....
        </textarea> </td></tr></table>
        <button>Send</button>



        <script>

            document.querySelector(".cf1").addEventListener('click', () =>
            {
                document.querySelector("#cf11").scrollIntoView()
            }
            );


            document.querySelector(".cf2").addEventListener('click', () =>
            {
                document.querySelector("#cf12").scrollIntoView()
            })   ;

            document.querySelector(".cf3").addEventListener('click', () =>
            {
                document.querySelector("#cf13").scrollIntoView(true)
            })           ;


            document.querySelector(".cf4").addEventListener('click', () =>
            {
                document.querySelector("#cf14").scrollIntoView(true)
            });










        </script>
    </body>
</html>
