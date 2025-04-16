# Computer Networking

## The OSI model

**OSI** stands for **Open Systems Interconnection** and its a concept framework for how applications communicate over a
network. It splits the network communication between 2 devices on a network into 7 abstraction layers. These layers are 
used to help users identify what is happening within a networking system and categorise anything happening in the network.
for example, if you’re doing troubleshooting, you may say that you have a layer 2 troubleshooting issue. This allows you 
to know where to focus your efforts. Another example is if you have a physical layer problem, you may have a problem with
a cable. These layers are provided by a mixture of network card drivers, operating systems, applications and networking 
hardware that facilitate the transmission of signals over Ethernet, fibre optic, Wi-Fi, or other wireless protocols.

At the bottom 4 layers, data is called different names The name for data at a specific OSI layer is **Protocol Data Unit
(PDU).** In the physical layer, data is called ‘**bits**’, in the data link layer its called ‘**frames**’, in the network
layer its called ‘**packets’** and in the transport layer its called ‘**segments’**.


### 7. Application

This is the layer most users interact with and will recognise. The application layer provides network services to the 
end user. These services are protocols that work with the data the client is using, such as **HTTP**, which is used with
web browsers like Google Chrome, Firefox and Internet Explorer. Other examples of applications that use this layer are 
Office, Outlook and Skype. All of those interactive applications provide a set of services that allow the application 
layer to supply data to and receive data from the presentation layer. Other protocols include **Simple mail Transfer 
Protocol (SMTP)**, **FTP** & **Telnet**.

### 6. Presentation

The presentation layer performs the uncomplicated task of syntax processing or converting data from one format to another
or in a way that the receiving application can understand it. This layer can also encrypt or decrypt data as needed. For
example, consider you’re ordering something online, these transactions are typically handled in a secure transmission which
means that the data passing between the store or web application will transmit encrypted data to the presentation layer 
that will need to be decrypted and processed. This layer handles translating the data from the top layer which is presented
in application format, to network format and vice versa. After the presentation layer processes the data from one format
to another, the information is then passed to the session layer or the application layer, depending on whether the data
is transmitting or receiving.

### 5. Session

The session layer is responsible for setting up , maintaining and terminating sessions between devices. This layer supports
multiple types of connections as well as being responsible for authentication and reconnection if a network interruption 
should occur. After the session is established, the data then passes to or from the transport layer.

### 4. Transport

The transport layer is responsible for the transmission of data across network connections. This layer coordinates how 
much data to send, how fast, where it goes etc. These services may be provided by the **Transmission control Protocol 
(TCP)** or **User Datagram Protocol (UDP).** Once the transport layer has completed its function, the data is then passed
to or from the network layer. This layer also adds the source and destination port numbers. Ports are logical endpoints 
used to distinguish multiple services running on a single device - like port 80 for HTTP and port 443 for HTTPS

### 3. Network

The network layer handles the routing of the data across different networks (logical addressing) and the IP addressing.
At this layer, the source and destination IP address are added. Routers operate at this layer. We had physical addressing
in our network interface card, but logical addressing would include things like **IPv4/IPv6**. After the data arrives at
this layer, each frame of data is examined to conclude if the data has reached its ultimate target. The layer sends data
to the correct destination on outgoing transmissions and receives incoming transmissions as well. The IP portion of 
**TCP/IP** is the commonly known example for the internet. This layer also manages the mapping between logical addresses
and physical addresses. For IP addresses, this is accomplished through **Address Resolution Protocol or ARP** 
(a communication protocol for discovering the link layer address, such as MAC address, associated with a internet layer
address, typically an IPv4 address). The data is then passed to the next required layer, which is the Data Link layer.

### 2. Data Link

The Data Link layer is considered the most complex of the layers. This layer is often divided into sublayers called 
**Media Access Control (MAC)** which is concerned with the physical addressing of a networking device and **Logical Link
Control (LLC)** which contains connection services. ****When this layer receives raw data from the physical layer, it 
checks for transmission errors and then packages the bits into data frames. From there, this layer manages the physical
addressing methods for the MAC or LLC layers and the physical address is added to the data, that is the source and the 
destination MAC addresses. An example of the MAC layer includes the 802.11 wireless specifications as well as Ethernet.
The Ethernet primarily lives in this layer. At the datalink layer, the data passes to or from the final layer in the OSI
model which is the Physical layer.

### 1. Physical

The Physical layer is the electrical/physical layer of the model. This layer encompasses the network cables, power plugs,
wireless radio frequencies, connectors, transceivers, receivers, repeaters, pulses of light, electric voltages, etc and 
is responsible for transmitting raw bits of data cross a physical connection. When troubleshooting problems occur, this
is typically the first place to start. Is the device plugged in? Is the wireless card working? At this layer, the model
transmits the digital data bits from the source or the sending device’s physical layer, over network communications media,
which can be electrical, mechanical, or radio to the receiving or destination device’s physical layer.

The OSI model is a guide for developers and vendors to smooth the progress of developing communications and software 
programs that will work in cooperation with a commonly established model. Once you understand the model, you can then 
understand which protocols and devices will be compatible with one another.

### Example 1 - Sending a WhatsApp message

1. Application - You type and hit send in WhatsApp.
2. Presentation - WhatsApp encrypts the message with end-to-end encryption.
3. Session - A secure session is maintained between your phone and the recipient’s.
4. Transport - WhatsApp uses TCP to ensure the message is delivered without loss.
5. Network - Your phone’s IP address sends the packet to WhatsApp’s servers.
6. Data Link - The packet travels from your phone’s network card to your Wi-Fi router.
7. Physical - Sent as radio waves over Wi-Fi or via physical cable to the ISP.

### Example 2 - Sending an email

Lets say you send an email. The data travels through the OSI model, adding and processing data on each layer. This 
process is called encapsulation.

1. Application - Outlook creates the data, the email you wrote, the email addresses etc. and gets ready to send it using
   SMTP.
2. Presentation - the data is formatted in a way the receiving device will understand. In this example probably ASCII. 
   This layer could also encrypt data if needed.
3. Session - a session with receiving mail server is started.
4. Transport - this is where it decides to use TCP or UDP. In this case we’ll use TCP to make sure every packet gets 
   delivered. Also, the source and destination port is added to the data.
5. Network - the IP address of the mail server is added as the destination and the source IP address is also added to
   the data.
6. Data Link - the MAC address of the router and the source MAC address of the host is added to the data.
7. Physical - the data is sent out on the network using ethernet. So when the data reaches the other side, the receiving
   device will process the data in the same way but in reverse, starting from the bottom up.

### Troubleshooting

How can we use the OSI model to troubleshoot? You’ll often hear people say  something along the lines of ‘that’s a 
layer 2 problem’. This is in reference to the OSI model. For example, lets say theres a problem with the network, if we
go through this model checking every layer, we can diagnose the problem. For example:

1. Layer 1 (Physical) - are all the cables plugged in? is the network card functioning? Could it be a faulty cable?
2. Layer 2 (Data) - Maybe the switch has gone bad.
3. Layer 3 (Network) - Is the router functioning? Do I have the right IP address?

## TCP & UDP

The 2 primary controls at the Transport layer are **TCP** and **UDP**. Whenever a computer wants to communicate with 
another computer, the communication between those 2 computers needs to be good and reliable, so it can guarantee that 
the data is received correctly. For example, when you want to view a web page, download a file or look at an email, 
you’d expect to view the web page intact and in order with nothing missing. or if you’re downloading a file, you’d want 
the entire file and not just a part of the file. A network application has to choose how to send its data.

### TCP

**TCP (Transmission Control Protocol)** provides reliable end-to-end communication between devices and for that reason 
its the most widely chosen option for transmitting data. TCP is one of the main protocols used in a TCP/IP network and 
its used to guarantee that all the data is received and is in order. Without TCP, some of the data could be missing or 
out of order. It works by dividing the data into small, manageable segments and sending each segment individually. Each
segment has a sequence number attached to it. The receiving end uses the sequence numbers to reassemble the data in the 
correct order. TCP is a **connection-oriented** protocol, which means that it must first acknowledge a session between 
the 2 computers that are communicating, so the 2 computers verify a connection before any communication takes place. 
it does this by using a **3 way handshake**:

1. Step 1 - a computer will send a message called a **SYN** (Synchronise).
2. Step 2 - the receiving computer will send back an acknowledgement message **(ACK message)** telling the sender that it 
    has received the message.
3. Step 3 - the sender computer sends another acknowledgment message back to the receiver.

Once this has taken place, data can be delivered. A similar process is also followed when closing this connection.

The way TCP can provide a stable and reliable connection is in three ways:

1. **Acknowledgement Numbers** - a value in a TCP segment that indicates the byte number of the last received data 
   byte, helping the sender know which bytes have been successfully received by the recipient.
2. **Sequence Numbers** - TCP will assign numbers to segments as they’re sent. This way the receiving device can 
   collect these segments and reorder them correctly and determine if any segments are missing. The sequence number is 
   just one field in the TCP header.
3.  **Checksum** - a simple calculation ran against the data. If the data has been transmitted successfully, the 
   checksum ran on the receiving side should match the checksum ran on the sender’s side. If some bits got messed up 
   along the way, then there will be a checksum mismatch and the segment will be discarded.

TCP guarantees the delivery of the data. so if a data packet doesn’t arrive, TCP will resend it. TCP also provides error
checking to make sure that the data was not corrupted during transmission.

### UDP

**UDP (User Datagram Protocol)** is another popular protocol in the transport layer also used for sending and receiving 
data. It’s similar to TCP but it’s simpler and faster and doesn’t have any of the error handling, sequencing or reliability
of TCP. The main difference is that UDP is connection-less. Which means that it doesn’t establish a session and does not
guarantee data delivery. So when a computer sends their data, it doesn’t really care if the data is received at the other
end. That’s why UDP is known as a **‘fire and forget’** protocol, because it sends data and doesn’t really care what 
happens to it. Because of the less overhead involved (not guaranteeing delivery or needing to establish a session), UDP
is faster than TCP.

Unlike TCP, UDP does not provide the same level of error checking and reliability. It simply sends packets of data from
one device to another. The receiving end is responsible for determining whether the packets were received correctly. 
If an error is detected, the receiving end simply discards the packet.

UDP is great for most common tasks such as web browsing, file transfer etc. where we don’t mind the latency issue in 
return for a stable connection. Where UDP is useful is in situations where we need live real-time. connections. 
For example, voice calls, video calls and gaming all need fast real-time connections. We can’t afford latency in these 
situations but we can handle a loss of voice data so occasionally dropping packets is better than waiting. On the other
hand, if we start trying to resend voice data, then this could cause latency and make the call inaudible.

The UDP header has a lot less information than the TCP header. The small header means less information, but is lighter
and quicker. Perfect for real time traffic

### Summary of differences

| **Feature**  | **TCP** | **UDP** |
| --- | --- | --- |
| **Connection** | Connection-oriented - establishes a connection before data transfer | Connectionless - no setup before sending data |
| Reliability | Reliable - ensures data is delivered and in the correct order | Unreliable - no guarantee of delivery or order |
| Error checking  | Yes - includes error checking and correction | Yes - includes error checking but no correction |
| Data ordering | Guaranteed - data arrives in order | No guarantee - packets may arrive out of order |
| Speed | Slower - due to overhead of error checking, acknowledgment etc.  | Faster - minimal overhead, no acknowledgments |
| Use cases | Web browsing (HTTP/HTTPS), Email (SMTP), File transfer (FTP) | Video streaming, online gaming, voice over IP (VoIP), DNS |
| Acknowledgments | Yes - receiver sends ACK for received data | No acknowledgment |
| Header size | Larger - 20-60 bytes | Smaller - 8 bytes |
| Flow control | Yes - manages data flow between sender and receiver | No flow control |

General rule :

- Use TCP when accuracy and reliability are crucial.
- Use UDP when speed and low latency are more important than perfect delivery.