const button = document.querySelector("#button1");

button.addEventListener("click", gamePanel);

const gamePanelText = document.getElementById("gamePanel");
const userInput = document.querySelector("#userInputs");

/*gamePanelText.innerText =
    `Welcome to my game!
    Please select one of the following options
    [1] Go to the store
    [2] Go for a walk`*/

gamePanelText.innerText = "What is your name?"
function gamePanel(event) {
    event.preventDefault();
        let name = userInput.value;
        gamePanelText.innerText = "Welcome " + name;
    userInput.value = '';
    console.log(name);
    
    if(name === "Marie") {
        gamePanelText.style.color = "#4F7942";
    }
    
    else {
        gamePanelText.style.color = "black";
    }
}
