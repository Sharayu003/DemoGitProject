"use strict";
	const multiply = Function(){
		const num1=document.getElementById("textnum1").value;
		const num2=document.getElementById("textnum2").value;
		const num3=document.getElementById("textnum3").value;
		const num4=document.getElementById("textnum4").value;
		
		document.getElementById("result").innerHTML = num1*num2*num3*num4;
		
		
	}