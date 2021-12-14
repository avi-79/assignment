const EventEmitter = require('events');

class LoggerMessage extends EventEmitter{
    log(msg){
        //Call Event
        this.emit('message',{msg});
    }
}

 


const logger = new LoggerMessage();
logger.on('message',(data)=> console.log('listener',data));
logger.log("Welcome to NodeJS");