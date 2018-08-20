import java.util.Scanner;

public class TmontoEscrito {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String[] arg={"x"};
	        int numero; int resta; int nuevo=1;
	        
	    	System.out.println("Por favor ingrese el monto: ");
	        numero=sc.nextInt();
	
while (nuevo!=0) {
	        	
	        	
	        	if (numero<=1999 && numero>=1000) 
	        	    {
	        		
	        		   resta=1000;	
	        		   System.out.println("Mil");
	        		   nuevo=numero-resta;
	        		   numero=nuevo;
	        		   
	        		  //System.out.println("numero es igual "+nuevo);
	        		  
	        		}
	        			
	        	    	else { 
	        	    		
	        	    		 if (numero<=999 && numero>=900) 
	        	    		      {
	        	    			  resta=900;	
	        	    			   System.out.println("novecientos");
	        	    			   nuevo=numero-resta;
	        	    			   numero=nuevo;
	        	    		      }
	        	    		 
	        	    		    else { 
	 	        	    		
		        	    	     	   if (numero<=2999 && numero>=2000)
		        	    		       {
		        	    			   resta=2000;	
		        	    			   System.out.println("dos mil");
		        	    			   nuevo=numero-resta;
		        	    			   numero=nuevo;
		        	    			    }
		        	    	     	   
		        	    	     	  else { 
		  	 	        	    		
			        	    	     	   if (numero<=3999 && numero>=3000)
			        	    		       {
			        	    			   resta=3000;	
			        	    			   System.out.println("tres mil");
			        	    			   nuevo=numero-resta;
			        	    			   numero=nuevo;
			        	    			    }
			        	    	     	   
			        	    	     	   
			        	    	     	  else { 
				  	 	        	    		
				        	    	     	   if (numero<=4999 && numero>=4000)
				        	    		       {
				        	    			   resta=4000;	
				        	    			   System.out.println("cuatro mil");
				        	    			   nuevo=numero-resta;
				        	    			   numero=nuevo;
				        	    			    }
	        	                                 
				        	    	     	  else { 
					  	 	        	    		
					        	    	     	   if (numero<=5999 && numero>=5000)
					        	    		       {
					        	    			   resta=5000;	
					        	    			   System.out.println("cinco mil");
					        	    			   nuevo=numero-resta;
					        	    			   numero=nuevo;
					        	    			    }
					        	    	     	   
					        	    	     	  else { 
						  	 	        	    		
						        	    	     	   if (numero<=6999 && numero>=6000)
						        	    		       {
						        	    			   resta=6000;	
						        	    			   System.out.println("seis mil");
						        	    			   nuevo=numero-resta;
						        	    			   numero=nuevo;
						        	    			    }
						        	    	     	   
						        	    	     	  else { 
							  	 	        	    		
							        	    	     	   if (numero<=7999 && numero>=7000)
							        	    		       {
							        	    			   resta=7000;	
							        	    			   System.out.println("siete mil");
							        	    			   nuevo=numero-resta;
							        	    			   numero=nuevo;
							        	    			    }
							        	    	     	  else { 
								  	 	        	    		
								        	    	     	   if (numero<=8999 && numero>=8000)
								        	    		       {
								        	    			   resta=8000;	
								        	    			   System.out.println("ocho mil");
								        	    			   nuevo=numero-resta;
								        	    			   numero=nuevo;
								        	    			    }
								        	    	     	   
								        	    	     	  else { 
									  	 	        	    		
									        	    	     	   if (numero<=9999 && numero>=9000)
									        	    		       {
									        	    			   resta=9000;	
									        	    			   System.out.println("nueve mil");
									        	    			   nuevo=numero-resta;
									        	    			   numero=nuevo;
									        	    			    }
									        	    	     	  else { 
										  	 	        	    		
										        	    	     	   if (numero<=199 && numero>=100)
										        	    		       {
										        	    			   resta=100;	
										        	    			   System.out.println("ciento");
										        	    			   nuevo=numero-resta;
										        	    			   numero=nuevo;
										        	    			    }
										        	    	     	  else { 
											  	 	        	    		
											        	    	     	   if (numero<=299 && numero>=200)
											        	    		       {
											        	    			   resta=200;	
											        	    			   System.out.println("docientos");
											        	    			   nuevo=numero-resta;
											        	    			   numero=nuevo;
											        	    			    }
											        	    	     	  else { 
												  	 	        	    		
												        	    	     	   if (numero<=399 && numero>=300)
												        	    		       {
												        	    			   resta=300;	
												        	    			   System.out.println("trecientos");
												        	    			   nuevo=numero-resta;
												        	    			   numero=nuevo;
												        	    			    }
												        	    	     	  else { 
													  	 	        	    		
													        	    	     	   if (numero<=499 && numero>=400)
													        	    		       {
													        	    			   resta=400;	
													        	    			   System.out.println("Cuatrocientos");
													        	    			   nuevo=numero-resta;
													        	    			   numero=nuevo;
													        	    			    }
													        	    	     	  else { 
														  	 	        	    		
														        	    	     	   if (numero<=599 && numero>=500)
														        	    		       {
														        	    			   resta=500;	
														        	    			   System.out.println("quinientos");
														        	    			   nuevo=numero-resta;
														        	    			   numero=nuevo;
														        	    			    }
														        	    	     	  else { 
															  	 	        	    		
															        	    	     	   if (numero<=699 && numero>=600)
															        	    		       {
															        	    			   resta=600;	
															        	    			   System.out.println("seicientos");
															        	    			   nuevo=numero-resta;
															        	    			   numero=nuevo;
															        	    			    }
															        	    	     	  else { 
																  	 	        	    		
																        	    	     	   if (numero<=799 && numero>=700)
																        	    		       {
																        	    			   resta=700;	
																        	    			   System.out.println("setecientos");
																        	    			   nuevo=numero-resta;
																        	    			   numero=nuevo;
																        	    			    }
																        	    	     	  else { 
																	  	 	        	    		
																	        	    	     	   if (numero<=899 && numero>=800)
																	        	    		       {
																	        	    			   resta=800;	
																	        	    			   System.out.println("ochocientos");
																	        	    			   nuevo=numero-resta;
																	        	    			   numero=nuevo;
																	        	    			    }
																	        	    	     	  else { 
																		  	 	        	    		
																		        	    	     	   if (numero<=29 && numero>=20)
																		        	    		       {
																		        	    			   resta=20;	
																		        	    			   System.out.println("veinte");
																		        	    			   nuevo=numero-resta;
																		        	    			   numero=nuevo;
																		        	    			    }
																		        	    	     	  else { 
																			  	 	        	    		
																			        	    	     	   if (numero<=39 && numero>=30)
																			        	    		       {
																			        	    			   resta=30;	
																			        	    			   System.out.println("treinta");
																			        	    			   nuevo=numero-resta;
																			        	    			   numero=nuevo;
																			        	    			    }
																			        	    	     	  else { 
																				  	 	        	    		
																				        	    	     	   if (numero<=49 && numero>=40)
																				        	    		       {
																				        	    			   resta=40;	
																				        	    			   System.out.println("cuarenta");
																				        	    			   nuevo=numero-resta;
																				        	    			   numero=nuevo;
																				        	    			    }
																				        	    	     	  else { 
																					  	 	        	    		
																					        	    	     	   if (numero<=59 && numero>=50)
																					        	    		       {
																					        	    			   resta=50;	
																					        	    			   System.out.println("cincuenta");
																					        	    			   nuevo=numero-resta;
																					        	    			   numero=nuevo;
																					        	    			    }
																					        	    	     	  else { 
																						  	 	        	    		
																						        	    	     	   if (numero<=69 && numero>=60)
																						        	    		       {
																						        	    			   resta=60;	
																						        	    			   System.out.println("sesenta");
																						        	    			   nuevo=numero-resta;
																						        	    			   numero=nuevo;
																						        	    			    }
																						        	    	     	  else { 
																							  	 	        	    		
																							        	    	     	   if (numero<=79 && numero>=70)
																							        	    		       {
																							        	    			   resta=70;	
																							        	    			   System.out.println("setenta");
																							        	    			   nuevo=numero-resta;
																							        	    			   numero=nuevo;
																							        	    			    }
																							        	    	     	  else { 
																								  	 	        	    		
																								        	    	     	   if (numero<=89 && numero>=80)
																								        	    		       {
																								        	    			   resta=80;	
																								        	    			   System.out.println("ochenta");
																								        	    			   nuevo=numero-resta;
																								        	    			   numero=nuevo;
																								        	    			    }
																								        	    	     	  else { 
																									  	 	        	    		
																									        	    	     	   if (numero<=99 && numero>=90)
																									        	    		       {
																									        	    			   resta=90;	
																									        	    			   System.out.println("noventa");
																									        	    			   nuevo=numero-resta;
																									        	    			   numero=nuevo;
																									        	    			    }
																									        	    	     	  else { 
																										  	 	        	    		
																										        	    	     	   if (numero==10)
																										        	    		       {
																										        	    			   resta=10;	
																										        	    			   System.out.println("diez");
																										        	    			   nuevo=numero-resta;
																										        	    			   numero=nuevo;
																										        	    			    }
																										        	    	     	  else { 
																											  	 	        	    		
																											        	    	     	   if (numero==11)
																											        	    		       {
																											        	    			   resta=11;	
																											        	    			   System.out.println("once");
																											        	    			   nuevo=numero-resta;
																											        	    			   numero=nuevo;
																											        	    			    }
																											        	    	     	  else { 
																												  	 	        	    		
																												        	    	     	   if (numero==12)
																												        	    		       {
																												        	    			   resta=12;	
																												        	    			   System.out.println("doce");
																												        	    			   nuevo=numero-resta;
																												        	    			   numero=nuevo;
																												        	    			    }
																												        	    	     	  else { 
																													  	 	        	    		
																													        	    	     	   if (numero==13)
																													        	    		       {
																													        	    			   resta=13;	
																													        	    			   System.out.println("trece");
																													        	    			   nuevo=numero-resta;
																													        	    			   numero=nuevo;
																													        	    			    }
																													        	    	     	  else { 
																														  	 	        	    		
																														        	    	     	   if (numero==14)
																														        	    		       {
																														        	    			   resta=14;	
																														        	    			   System.out.println("catorce");
																														        	    			   nuevo=numero-resta;
																														        	    			   numero=nuevo;
																														        	    			    }
																														        	    	     	  else { 
																															  	 	        	    		
																															        	    	     	   if (numero==15)
																															        	    		       {
																															        	    			   resta=15;	
																															        	    			   System.out.println("quince");
																															        	    			   nuevo=numero-resta;
																															        	    			   numero=nuevo;
																															        	    			    }
																															        	    	     	  else { 
																																  	 	        	    		
																																        	    	     	   if (numero==16)
																																        	    		       {
																																        	    			   resta=16;	
																																        	    			   System.out.println("dieciseis");
																																        	    			   nuevo=numero-resta;
																																        	    			   numero=nuevo;
																																        	    			    }
																																        	    	     	  else { 
																																	  	 	        	    		
																																	        	    	     	   if (numero==17)
																																	        	    		       {
																																	        	    			   resta=17;	
																																	        	    			   System.out.println("diecisiete");
																																	        	    			   nuevo=numero-resta;
																																	        	    			   numero=nuevo;
																																	        	    			    }
																																	        	    	     	  else { 
																																		  	 	        	    		
																																		        	    	     	   if (numero==18)
																																		        	    		       {
																																		        	    			   resta=18;	
																																		        	    			   System.out.println("dieciocho");
																																		        	    			   nuevo=numero-resta;
																																		        	    			   numero=nuevo;
																																		        	    			    }
																																		        	    	     	  else { 
																																			  	 	        	    		
																																			        	    	     	   if (numero==19)
																																			        	    		       {
																																			        	    			   resta=19;	
																																			        	    			   System.out.println("diecinueve");
																																			        	    			   nuevo=numero-resta;
																																			        	    			   numero=nuevo;
																																			        	    			    }
																																			        	    	     	  else { 
																																				  	 	        	    		
																																				        	    	     	   if (numero==1)
																																				        	    		       {
																																				        	    			   resta=1;	
																																				        	    			   System.out.println("uno");
																																				        	    			   nuevo=numero-resta;
																																				        	    			   numero=nuevo;
																																				        	    			    }
																																				        	    	     	  else { 
																																					  	 	        	    		
																																					        	    	     	   if (numero==2)
																																					        	    		       {
																																					        	    			   resta=2;	
																																					        	    			   System.out.println("dos");
																																					        	    			   nuevo=numero-resta;
																																					        	    			   numero=nuevo;
																																					        	    			    }
																																					        	    	     	  else { 
																																						  	 	        	    		
																																						        	    	     	   if (numero==3)
																																						        	    		       {
																																						        	    			   resta=3;	
																																						        	    			   System.out.println("tres");
																																						        	    			   nuevo=numero-resta;
																																						        	    			   numero=nuevo;
																																						        	    			    }
																																						        	    	     	  else { 
																																							  	 	        	    		
																																							        	    	     	   if (numero==4)
																																							        	    		       {
																																							        	    			   resta=4;	
																																							        	    			   System.out.println("cuatro");
																																							        	    			   nuevo=numero-resta;
																																							        	    			   numero=nuevo;
																																							        	    			    }
																																							        	    	     	  else { 
																																								  	 	        	    		
																																								        	    	     	   if (numero==5)
																																								        	    		       {
																																								        	    			   resta=5;	
																																								        	    			   System.out.println("cinco");
																																								        	    			   nuevo=numero-resta;
																																								        	    			   numero=nuevo;
																																								        	    			    }
																																								        	    	     	  else { 
																																									  	 	        	    		
																																									        	    	     	   if (numero==6)
																																									        	    		       {
																																									        	    			   resta=6;	
																																									        	    			   System.out.println("seis");
																																									        	    			   nuevo=numero-resta;
																																									        	    			   numero=nuevo;
																																									        	    			    }
																																									        	    	     	  else { 
																																										  	 	        	    		
																																										        	    	     	   if (numero==7)
																																										        	    		       {
																																										        	    			   resta=7;	
																																										        	    			   System.out.println("siete");
																																										        	    			   nuevo=numero-resta;
																																										        	    			   numero=nuevo;
																																										        	    			    }
																																										        	    	     	  else { 
																																											  	 	        	    		
																																											        	    	     	   if (numero==8)
																																											        	    		       {
																																											        	    			   resta=8;	
																																											        	    			   System.out.println("ocho");
																																											        	    			   nuevo=numero-resta;
																																											        	    			   numero=nuevo;
																																											        	    			    }
																																											        	    	     	  else { 
																																												  	 	        	    		
																																												        	    	     	   if (numero==9)
																																												        	    		       {
																																												        	    			   resta=9;	
																																												        	    			   System.out.println("nueve");
																																												        	    			   nuevo=numero-resta;
																																												        	    			   numero=nuevo;
																																												        	    			    }
																																								        	    	     	  
																			        	    	     	   
	        	    		 
	        	    		             else { 
	        	    	    		
	        	        		 
	        			                        System.out.println("valor invalido");
	        			 
	        		                          }  
																																											        	    	     	  }
																																										        	    	     	  }
																																									        	    	     	  }
																																								        	    	     	  }
																																							        	    	     	  }
																																						        	    	     	  }
																																					        	    	     	  }
																																				        	    	     	  }
																																			        	    	     	  }
																																		        	    	     	  }
																																	        	    	     	  }
																																        	    	     	  }
																															        	    	     	  }
																														        	    	     	  }
																													        	    	     	  }
																												        	    	     	  }
																											        	    	     	  }
																										        	    	     	  }
																									        	    	     	  }
																								        	    	     	  }
																							        	    	     	  }
																						        	    	     	  }
																					        	    	     	  }
																				        	    	     	  }
																			        	    	     	  }
																		        	    	     	  }
																	        	    	     	  }
																        	    	     	  }
															        	    	     	  }
														        	    	     	  }
													        	    	     	  }
												        	    	     	  }
											        	    	     	  }
										        	    	     	  }
									        	    	     	  }
								        	    	     	  }
							        	    	     	  }
						        	    	     	  }
						        	    	     	   
					        	    	     	        }
					        	    	     	   }
				        	    	     	   
			        	    	     	        }
	        	    		               } 
	        	    		     }
	        	    	     }
	        			
	        	}
	      }
}

	

