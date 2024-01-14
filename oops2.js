let circle = {
    area(r) {
        return Math.PI * r * r;
    },
    circum(r) {
        return 2 * Math.PI * r;
    },
    h: "hello"
};

console.log(circle.area(10));
console.log(`perimeter ${circle.circum(10)}, ${circle["h"]}`);

