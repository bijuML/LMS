var check = function() {
var myInput = document.getElementById("new-user-pass");
var letter = document.getElementById("letter");
var capital = document.getElementById("capital");
var number = document.getElementById("number");
var splCharacter = document.getElementById("splCharacter");
var length = document.getElementById("length");

// Validate lowercase letters
var lowerCaseLetters = /[a-z]/g;
if(myInput.value.match(lowerCaseLetters)) {  
  letter.classList.remove("invalid");
  letter.classList.add("valid");
} else {
  letter.classList.remove("valid");
  letter.classList.add("invalid");
}

// Validate capital letters
var upperCaseLetters = /[A-Z]/g;
if(myInput.value.match(upperCaseLetters)) {  
  capital.classList.remove("invalid");
  capital.classList.add("valid");
} else {
  capital.classList.remove("valid");
  capital.classList.add("invalid");
}

// Validate numbers
var numbers = /[0-9]/g;
if(myInput.value.match(numbers)) {  
  number.classList.remove("invalid");
  number.classList.add("valid");
} else {
  number.classList.remove("valid");
  number.classList.add("invalid");
}

//validate special character
var splCharacters = /(?=.*[!@#$%^&*])/g;
if(myInput.value.match(splCharacters)) {  
	splCharacter.classList.remove("invalid");
	splCharacter.classList.add("valid");
} else {
	  splCharacter.classList.remove("valid");
	  splCharacter.classList.add("invalid");
}

// Validate length
if(myInput.value.length >= 8) {
  length.classList.remove("invalid");
  length.classList.add("valid");
} else {
  length.classList.remove("valid");
  length.classList.add("invalid");
}

if(myInput.value.match(lowerCaseLetters) && myInput.value.match(upperCaseLetters) &&
		  myInput.value.match(numbers) && myInput.value.match(splCharacters) && myInput.value.length >= 8){
	  document.getElementById('PSWstrengthContainer').style.display = "none";
}
else {
	  document.getElementById('PSWstrengthContainer').style.display = "block";
}
}