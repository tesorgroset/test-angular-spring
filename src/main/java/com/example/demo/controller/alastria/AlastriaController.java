package com.example.demo.controller.alastria;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.TextCodec;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class AlastriaController {
	
	@GetMapping(value="/alastria/register")
	private String register(){
		
		//(DISPOSITIVO) Creacion de clave publica y privada
		
		//(SERVICE PROVIDER) Creacion del alastria token en formate AT - Alastria token (JSON )
		//este json se envia al dispositivo del usuario mediante un codigo QR o una notificación push
		String token = Jwts.builder().claim("iss","alastria id del service provider")
				.claim("aoa", "URL del Alatria Open Access del proveedor")
				.claim("cbu", "URL del callback a la que se debe responder con la dirección pública del usuario (clave publica)")
				.claim("ani", "Identificador de la red alastria")
				.claim("iat", "Fecha de emision")
				.claim("exp","Fecha de expiracion")
				//opcionalmente:
				.claim("nbf", "Fecha de activacion del token")
				.claim("jti", "Identificador único de token")
				//se firma con la clave privada del usuario
				.signWith(SignatureAlgorithm.HS256, TextCodec.BASE64.encode("claveprivada de la entidad"))
				.compact();
		log.info("JWT: "+token);
		
		//Cracion del Alastria Identity Creation (AIC) por el dispositivo
		/*
{
  From: 0xCuentaUsuario,
  To: 0xMetaIdentityManager,
  Value: empty,
  Data: PayloadBytes //createIdentityWithCall(0xCuentaUsuario,AlastriaIDServiceProvider,0xRegistry,PayloadBytesCallRegistry)
}.FirmaCuentaUsuario
//Payload llamada a registry
  Data: registry. SetPubKey(HashPubKeyCuentaUsuario)		 */
		// el AICse envia al gateway el cual realiza las verificaciones 
		
		// el gateway manda el AIC + AT + Clave publica del usuario al Identity Manager (Interfaz de alastria)
		// alastria le devuelve el alastria_id al gateway el cual a su vez se lo envía al dispositivo del usuario y al service provider el cual lo
		// incorpora en sus sistemas para establecer al identificacion alastria-usuario para posteriores autenticaciones con alastriaid
		
		return "";
	}

}
