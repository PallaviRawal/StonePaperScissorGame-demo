let userScore=0;
let compScore=0;

const choices=document.querySelectorAll(".choice");

const genCompChoice=()=>{
const options=["rock","paper","scissors"];
const randIdx=Math.floor(Math.random()*3);
return options[randIdx];
};

const drawGame=()=>{
console.log("Game was draw");
msg.innerText="Game was draw. Play Again";
msg.style.backgroundColor="black";


};

const userScorePara=document.querySelector("#userScore");
const compScorePara=document.querySelector("#compScore");


const showWinner=(userWin,userChoice,compChoice)=>{
if(userWin){
userScore++;
userScorePara.innerText=userScore;
msg.innerText=`You Win! Your ${userChoice} beats ${compChoice}`;
msg.style.backgroundColor="green";
}else{
compScore++;
compScorePara.innerText=compScore;
msg.innerText=`You Lose.Comp ${compChoice} beats ${userChoice}`;
msg.style.backgroundColor="red";
}
};

const playGame=(userChoice) =>{
console.log("User Choice=",userChoice);
const compChoice=genCompChoice();
console.log("Comp Choice=",compChoice);

if(userChoice===compChoice){
drawGame();
}else{
let userWin=true;
if(userChoice==="rock"){
userWin=compChoice==="paper"?false:true;
}else if(userChoice==="paper"){
userWin=compChoice==="scissors"?false:true;
}else{
userWin=compChoice==="rock"?false:true;
}

const show=showWinner(userWin,userChoice,compChoice);
console.log(show);
}
};

choices.forEach((choice)=>{
console.log(choice);
choice.addEventListener("click",()=>{
const userChoice=choice.getAttribute("id");
const play=playGame(userChoice);
console.log(play);
});
})

