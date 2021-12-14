const fs = require('fs');
const path = require('path');


 /*fs.mkdir(path.join(__dirname,"/Training Details"),{},function(err){
    if(err) throw err;
    console.log('')
}
) */


 /* fs.writeFile(path.join(__dirname,'/Training Details','/student.txt')
,'This is Student file'
,(err) => {
    if(err) throw err;
    console.log('File Written to ...');
}
) */

fs.readFile(path.join(__dirname,'/Training Details','/student.txt'),'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
});