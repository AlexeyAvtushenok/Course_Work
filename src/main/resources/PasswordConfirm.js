


function Validate() {
    var password = document.getElementById("password");
    var password_repeat = document.getElementById("password_repeat");
    var error = document.getElementById("pass_error");

   if(!(password.value === password_repeat.value)){

       error.hidden = false;
       password.value = "";
       password_repeat.value = "";
       password.focus();
       return false;
    }
    else {
       error.hidden = true;
       return true;
   }



}

