function validateEquality(password, passwordconf) {
  if(password === passwordconf) { return 1; }
  else {
    alert("Passwords do not match.");
    return 0;
  }
}

function getFormData() {
  var username = document.getElementById("user-reg").value;
  var password = document.getElementById("pass-reg").value;
  var passwordconf = document.getElementById("pass-reg-conf").value;
  var firstname = document.getElementById("fn-reg").value;
  var lastname = document.getElementById("ln-reg").value;
  var email = document.getElementById("email-reg").value;

  if(validateEquality(password, passwordconf) !== 1) {
    alert("Passwords do not match.");
  }

  return { username: username, password: password, firstname: firstname,
           lastname: lastname, email: email  };
}