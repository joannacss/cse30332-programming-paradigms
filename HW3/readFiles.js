// import the NodeJS modules
const fs = require('fs');               // module for file I/O
const readline = require("readline");   // module for reading line-by-line from file

// create input streams
let defectsCSV = fs.createReadStream("defects.csv");        
let dependsCSV = fs.createReadStream("defect_depends.csv");
let blocksCSV = fs.createReadStream("defect_blocks.csv");
let developersCSV = fs.createReadStream("developers.csv");

// set up the readline module to read from the file streams
let defectsReader = readline.createInterface({ input: defectsCSV });
let dependsReader = readline.createInterface({ input: dependsCSV });
let blocksReader = readline.createInterface({ input: blocksCSV });
let developersReader = readline.createInterface({ input: developersCSV });

// the code below reads from each file stream, line-by-line
developersReader.on("line", (row) => { 
    let columns = row.split(",");
    console.log(columns);
}); 

blocksReader.on("line", (row) => { 
    let columns = row.split(",");
    console.log(columns);
}); 

dependsCSV.on("line", (row) => { 
    let columns = row.split(",");
    console.log(columns);
});

defectsReader.on("line", (row) => { 
    let columns = row.split(",");
    console.log(columns);
});