 /*
 Open two browsers
Open DevTools on both
Paste peerA.js content in first browser dev tools
Copy the SDP offer generated JSON
Got to the second browser and create "offer" object and set it to the SDP you copied (signled) 
Paste peerB.js content in second browser dev tools
Go back to First browser (peer A) and paste the content of peerA_Final.js
use sendChannel.send() to send data from peerA 
use remoteConnection.channel.send() to send data from peerB


 peer a
 */

 
 /*
//you can specify a STUN server here
const iceConfiguration = { }
iceConfiguration.iceServers = [];
//turn server
iceConfiguration.iceServers.push({
                urls: 'turn:my-turn-server.mycompany.com:19403',
                username: 'optional-username',
                credentials: 'auth-token'
            })
//stun  server
iceConfiguration.iceServers.push({
                urls: 'turn:stun1.l.google.com:19302' 
            })    
const localConnection = new RTCPeerConnection(iceConfiguration)
*/

const localConnection = new RTCPeerConnection()
 

localConnection.onicecandidate = e =>  {
console.log(" NEW ice candidnat!! on localconnection reprinting SDP " )
 console.log(JSON.stringify(localConnection.localDescription))
}


const sendChannel = localConnection.createDataChannel("sendChannel");
 sendChannel.onmessage =e =>  console.log("messsage received!!!"  + e.data )
   sendChannel.onopen = e => console.log("open!!!!");
     sendChannel.onclose =e => console.log("closed!!!!!!");


localConnection.createOffer().then(o => localConnection.setLocalDescription(o) )


//peer b
//

//set offer const offer = ...
const remoteConnection = new RTCPeerConnection()

remoteConnection.onicecandidate = e =>  {
console.log(" NEW ice candidnat!! on localconnection reprinting SDP " )
 console.log(JSON.stringify(remoteConnection.localDescription) )
}

 
remoteConnection.ondatachannel= e => {

      const receiveChannel = event.channel;
      receiveChannel.onmessage =e =>  console.log("messsage received!!!"  + e.data )
      receiveChannel.onopen = e => console.log("open!!!!");
      receiveChannel.onclose =e => console.log("closed!!!!!!");
      remoteConnection.channel = receiveChannel;

}


remoteConnection.setRemoteDescription(offer).then(a=>console.log("done"))

//create answer
await remoteConnection.createAnswer().then(a => remoteConnection.setLocalDescription(a)).then(a=>
console.log(JSON.stringify(remoteConnection.localDescription)))
//send the anser to the client 


//peer a final//

//this opens the connection

localConnection.setRemoteDescription (answer).then(a=>console.log("done"))