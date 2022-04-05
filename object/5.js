var myObject = {firstname: "Nikhil"
                ,lastname: "P"
                ,age: "22"
                ,city: "XYZ"
                ,state: "Delhi"
                ,country: "India"};
console.log(`since there is no middle name defined The middle name is : ${myObject.MiddleName}`);
myObject.MiddleName = "IDK";
console.log(`After defining The middle name is : ${myObject.MiddleName}`);