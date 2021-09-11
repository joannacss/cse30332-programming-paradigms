// import the NodeJS modules
const fs = require('fs');               // module for file I/O
const readline = require("readline");   // module for reading line-by-line from file

// create input streams
let defectsCSV = fs.readFileSync("defects.csv","utf8");        
let dependsCSV = fs.readFileSync("defect_depends.csv","utf8");
let blocksCSV = fs.readFileSync("defect_blocks.csv","utf8");
let developersCSV = fs.readFileSync("developers.csv","utf8");

// Reads defects CSV line-by-line
defectsCSV.split("\r\n").forEach(row =>{
    let columns = row.split(",");
    console.log(columns);
});

dependsCSV.split("\r\n").forEach(row =>{
    let columns = row.split(",");
    console.log(columns);
});

blocksCSV.split("\r\n").forEach(row =>{
    let columns = row.split(",");
    console.log(columns);
});

developersCSV.split("\r\n").forEach(row =>{
    let columns = row.split(",");
    console.log(columns);
});
