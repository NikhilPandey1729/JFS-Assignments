let Order={
    id:12,
    title:"Noodles",
    cost:"200 Rs",
    printOrder()
    {
      console.log(" id No.:"+Order.id+" , "+
                    "Order:"+Order.title +" ,"+
                    "Cost is:"+Order.cost);
    },
    getPrice()
    {
        console.log("Price is:"+Order.cost);
    }
};
let Order1=Object.assign(Order);
console.log(Order1);
console.log(Order1.printOrder());
console.log(Order1.getPrice());
