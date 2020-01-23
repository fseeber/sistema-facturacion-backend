package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\n" + 
			"MIIEpQIBAAKCAQEA2pAwDEZhzUk+HOR3ZcX7I3fxijLPfmUf2RKoHcUwyyDPtOax\n" + 
			"g+t0PbWaQMnuApr24/xRN0vs9aK6yH2FtgJa4Cl4I8eZ0LXdP4WETYeQT/NJegec\n" + 
			"dzKlQwPQmqKjjRmGP55CQ9t689MNK/HkER8bU9jMzKPCJPfbMHHip/RXHll1H6Mr\n" + 
			"fnEuyuqecNAFMbDHs9nK2mX4bUQ027ITwF34kI3GB1O9SiUak1drtqYgn9ej1qeZ\n" + 
			"lavraMqNBimn/40QQrNuE6sXkyTOkTfui3D+GiPau6cUL7+zumLDSYQ/vroj7sMq\n" + 
			"ctZDk1CMo+/7za5iXb4Au6fKPeTAU8q5PAF1GwIDAQABAoIBACbxO+5j9/cYzr1d\n" + 
			"I7z5epbGPz4tcXUG1Zba0SOEx/3ZWcjUtdpYcHyyR8q1b/f83nKeuWXN3Gmj1f31\n" + 
			"B4b3gnOgT+yoGsrqLIKt6nXZ6qekJHpess02M+Xt3xQ+WD/CxX2+V/Y5O/4Ho7gp\n" + 
			"wEYgscDNxyfLIcNuehp2oDjmu0MHvvmNYPG/imDwSJb6RgblRDl5elC0iRm0IWTP\n" + 
			"Dd2cJNprl+85cIYrVHOLUIrximkk6y2qmdyJk3rRRBdu5YWfdrRReshPT6ByDB+M\n" + 
			"VVjTk4dvadMpHugT8hrs6MLWH1WZbusLzVmIcXmg3o49uDyyQtlkTw69mJlzzD1U\n" + 
			"akriS0ECgYEA+zq+EhKic7yVG0aP9b9Tkv2PJ11e/KeKGymHonlLRYZyMS37jGCc\n" + 
			"RPtuOle0R7iUNs3iEcG0xMzCZnoo3E71NEQuzmhdB+h7yr86D10JY55cOW67ei3i\n" + 
			"tu9OCYbo7Wx/I7KHfCsvrMpZJf8WA0ypPZOTRVpMrNPG+bEpBGpPGDsCgYEA3ram\n" + 
			"kBFoFRXGAwnqiXJsZW5/sq1kxrZgH9uXXYKSsz8QokUn4JflExdmnW0Eikr2xkWR\n" + 
			"9H/bhuN8ZAE/+uEtBO4X5zW/2GGNfRDWD6aGYExnjk1cJ7GxRKOj77gm3EqgzVGM\n" + 
			"gPqM8DsodinPomEtJFvd28g01EFDpPrhjj/OKKECgYEA5GbNcqTaaJpkfP2z19nv\n" + 
			"40z+nu02dEDlQDiLhVz83+KRYsDJVyBmMhjcZ9Jgpmva49Bd3YLcE6eMfZpGF7T5\n" + 
			"HGF4pFMhcRUdpoAgCuOsq5LHibdwXm3lFieOLP8oOOJQ3GVs46hnmZIFZpP4sVs6\n" + 
			"6i6Gz6B+4QlQdqVoAwmbiw0CgYEAyhzyDZ5uWWw4FbvjB7c6ndZotutaoGcT1vV+\n" + 
			"aVM89MRPwSOHa/AM6IV9D3LHAwXC6+5o5X0+6Sv7T/o+aNv+8hFsydvibWkicRRd\n" + 
			"XzidjDjqZZ7Y+gDtQcBL3xm80oA7a/kMzGQUkVLuhkWtc8xCnlNshK8tGk7cJ5Wy\n" + 
			"KljHK+ECgYEAvTFE6CdDQV4KktQX4HrysGDXKhYwO921MT0ZECyzc+YkiI1fGSNo\n" + 
			"SmJ8IZltdZXdTFp9OCF4s67/OWijCuJRomF25PPwNwfgV82pKaPVQJm+llN320p7\n" + 
			"0Qa8aTwcNIkpE18f9Y7e0TcgZ65RlyGoq31DOua2zZRyVBUBiikkgIM=\n" + 
			"-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2pAwDEZhzUk+HOR3ZcX7\n" + 
			"I3fxijLPfmUf2RKoHcUwyyDPtOaxg+t0PbWaQMnuApr24/xRN0vs9aK6yH2FtgJa\n" + 
			"4Cl4I8eZ0LXdP4WETYeQT/NJegecdzKlQwPQmqKjjRmGP55CQ9t689MNK/HkER8b\n" + 
			"U9jMzKPCJPfbMHHip/RXHll1H6MrfnEuyuqecNAFMbDHs9nK2mX4bUQ027ITwF34\n" + 
			"kI3GB1O9SiUak1drtqYgn9ej1qeZlavraMqNBimn/40QQrNuE6sXkyTOkTfui3D+\n" + 
			"GiPau6cUL7+zumLDSYQ/vroj7sMqctZDk1CMo+/7za5iXb4Au6fKPeTAU8q5PAF1\n" + 
			"GwIDAQAB\n" + 
			"-----END PUBLIC KEY-----";
}
