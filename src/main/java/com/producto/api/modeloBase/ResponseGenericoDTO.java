package com.producto.api.modeloBase;

public class ResponseGenericoDTO {

	    private String idProccess;
	    private String ip;
	    private  String mensaje;
	    private String status;
	    
	    
	    
	    public ResponseGenericoDTO() {}
	    
		/**
		 * @param idProccess
		 * @param ip
		 * @param mensaje
		 * @param status
		 */
		public ResponseGenericoDTO(String idProccess, String ip, String mensaje, String status) {
			this.idProccess = idProccess;
			this.ip = ip;
			this.mensaje = mensaje;
			this.status = status;
		}
		
		
		/**
		 * @return the idProccess
		 */
		public String getIdProccess() {
			return idProccess;
		}
		/**
		 * @param idProccess the idProccess to set
		 */
		public void setIdProccess(String idProccess) {
			this.idProccess = idProccess;
		}
		/**
		 * @return the ip
		 */
		public String getIp() {
			return ip;
		}
		/**
		 * @param ip the ip to set
		 */
		public void setIp(String ip) {
			this.ip = ip;
		}
		/**
		 * @return the mensaje
		 */
		public String getMensaje() {
			return mensaje;
		}
		/**
		 * @param mensaje the mensaje to set
		 */
		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}
		/**
		 * @return the status
		 */
		public String getStatus() {
			return status;
		}
		/**
		 * @param status the status to set
		 */
		public void setStatus(String status) {
			this.status = status;
		}
	    
	    
	    
}
