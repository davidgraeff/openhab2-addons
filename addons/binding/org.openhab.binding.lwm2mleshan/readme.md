# Lwm2m Openhab2 Binding
This binding integrates a Leshan ([[https://github.com/eclipse/leshan]]) lwm2m
server into OpenHab2.

The Lightweight M2M (lwm2m) standard consists of the following features:
- Simple Object based resource model
- Resource operations of creation/retrieval/update/deletion/configuration of attribute
- Resource observation/notification
- TLV/JSON/Plain Text/Opaque data format support
- UDP and SMS transport layer support
- DTLS based security
- Multiple LWM2M Servers on a client supported
- Basic M2M functionalities:
  * LWM2M Server
  * Access Control
  * Device information (battery capacity, manufacturer, etc)
  * Firmware Update
  * Location
  * Connectivity Statistics 

[[basic_archi.png]]
  
This is in a way similar to MQTT (Message Queue Telemetry Transport) and MQTT-SN where ressources of a client can be read/written/observed by their path/topic. Every client connects to a broker in the MQTT world. Lwm2m uses CoAP as the underlying protocol, which is also organized in a server/client structure. 

In contrast to MQTT or CoAP the Lwm2m specification includes predefined objects / ressources (for example LEDs, switches, etc) which can easily be mapped to OpenHab2 things / channels.

If a newly connected lwm2m device uses predefined lwm2m ressources, it is automatically discoverable by the Openhab2 Thing Discovery and configured by a simple click.

## WORK IN PROGRESS - In Development
This addon is in development. Please report bugs to david.graeff@web.de.
