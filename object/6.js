var string = "{firstName:'Nikhil', age:22, city:'XYZ', state:'Delhi', country:'India'}";
eval('var obj='+string);
console.log(obj);
obj.MiddleName = "Pandey";
console.log(` The middle name is : ${obj.MiddleName}`);