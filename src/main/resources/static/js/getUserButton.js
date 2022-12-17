const userButton = document.querySelector("#get-user-button");
      const responseContainer = document.querySelector("#user-button-response");
      const failMessage = "No data received, please start Tomcat with command: mvn spring-boot:run";

      function fetchPersonData() {
        // Make an HTTP GET request to the API endpoint
        fetch("http://localhost:8080/user")
          .then(response => response.json()) // Parse the response as JSON
          .then(data => {
          // Update the response container with the received message
          var table = "<table class='table'><tr><th>Key</th><th>Value</th></tr>";
          for (var key in data) {
              if (data.hasOwnProperty(key)) {
                  table += "<tr><td>" + key + "</td><td>" + data[key] + "</td></tr>";
              }
          }
            table += "</table>";
            // console.log(data);
            responseContainer.innerHTML = table;
          })
          .catch(error => {
              // Handle any errors here
              responseContainer.innerHTML = failMessage;
              console.error(error);
          });
    }

// Add an event listener to the button
userButton.addEventListener("click", fetchPersonData);