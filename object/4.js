var myObject = {firstname: "Nikhil "
                ,lastname: "Pan"
                ,age: "22"
                ,city: "XYZ"
                ,state: "Delhi"
                ,country: "India"};
console.log(`First-name is ${myObject.firstname} ,
             lastname  is ${myObject.lastname} , age is ${myObject.age} 
            , city is ${myObject.city} , state is ${myObject.state} , country is ${myObject.country}`);
myObject.lastname = "Pandey";
console.log(`Changed Lastname ${myObject.lastname}`);