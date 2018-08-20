import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class TmontoEscritoTest {

	@Test
	void testMontoEscrito() {
		 Scanner sc = new Scanner(System.in);
	        String[] arg={"x"};
	        int numero; int resta; int nuevo=1;
	        String resobtenido="";
	    	System.out.println("Por favor ingrese el monto: ");
	        numero=sc.nextInt();
	
while (nuevo!=0) {
	        	
	        	
	        	if (numero<=1999 && numero>=1000) 
	        	    {
	        		
	        		   resta=1000;	
	        		   resobtenido=resobtenido+" "+"Mil";
	        		   System.out.println("Mil");
	        		   nuevo=numero-resta;
	        		   numero=nuevo;
	        		   
	        		  //System.out.println("numero es igual "+nuevo);
	        		  
	        		}
	        			
	        	    	else { 
	        	    		
	        	    		 if (numero<=999 && numero>=900) 
	        	    		      {
	        	    			  resta=900;
	        	    			  resobtenido=resobtenido+" "+"novecientos";
	        	    			   System.out.println("novecientos");
	        	    			   nuevo=numero-resta;
	        	    			   numero=nuevo;
	        	    		      }
	        	    		 
	        	    		    else { 
	 	        	    		
		        	    	     	   if (numero<=2999 && numero>=2000)
		        	    		       {
		        	    			   resta=2000;	
		        	    			   resobtenido=resobtenido+" "+"dos mil";
		        	    			   System.out.println("dos mil");
		        	    			   nuevo=numero-resta;
		        	    			   numero=nuevo;
		        	    			    }
		        	    	     	   
		        	    	     	  else { 
		  	 	        	    		
			        	    	     	   if (numero<=3999 && numero>=3000)
			        	    		       {
			        	    			   resta=3000;	
			        	    			   resobtenido=resobtenido+" "+"tres mil";
			        	    			   System.out.println("tres mil");
			        	    			   nuevo=numero-resta;
			        	    			   numero=nuevo;
			        	    			    }
			        	    	     	   
			        	    	     	   
			        	    	     	  else { 
				  	 	        	    		
				        	    	     	   if (numero<=4999 && numero>=4000)
				        	    		       {
				        	    			   resta=4000;	
				        	    			   resobtenido=resobtenido+" "+"cuatro mil";
				        	    			   System.out.println("cuatro mil");
				        	    			   nuevo=numero-resta;
				        	    			   numero=nuevo;
				        	    			    }
	        	                                 
				        	    	     	  else { 
					  	 	        	    		
					        	    	     	   if (numero<=5999 && numero>=5000)
					        	    		       {
					        	    			   resta=5000;	
					        	    			   resobtenido=resobtenido+" "+"cinco mil";
					        	    			   System.out.println("cinco mil");
					        	    			   nuevo=numero-resta;
					        	    			   numero=nuevo;
					        	    			    }
					        	    	     	   
					        	    	     	  else { 
						  	 	        	    		
						        	    	     	   if (numero<=6999 && numero>=6000)
						        	    		       {
						        	    			   resta=6000;
						        	    			   resobtenido=resobtenido+" "+"seis mil";
						        	    			   System.out.println("seis mil");
						        	    			   nuevo=numero-resta;
						        	    			   numero=nuevo;
						        	    			    }
						        	    	     	   
						        	    	     	  else { 
							  	 	        	    		
							        	    	     	   if (numero<=7999 && numero>=7000)
							        	    		       {
							        	    			   resta=7000;	
							        	    			   resobtenido=resobtenido+" "+"siete mil";
							        	    			   System.out.println("siete mil");
							        	    			   nuevo=numero-resta;
							        	    			   numero=nuevo;
							        	    			    }
							        	    	     	  else { 
								  	 	        	    		
								        	    	     	   if (numero<=8999 && numero>=8000)
								        	    		       {
								        	    			   resta=8000;	
								        	    			   resobtenido=resobtenido+" "+"ocho mil";
								        	    			   System.out.println("ocho mil");
								        	    			   nuevo=numero-resta;
								        	    			   numero=nuevo;
								        	    			    }
								        	    	     	   
								        	    	     	  else { 
									  	 	        	    		
									        	    	     	   if (numero<=9999 && numero>=9000)
									        	    		       {
									        	    			   resta=9000;	
									        	    			   resobtenido=resobtenido+" "+"nueve mil";
									        	    			   System.out.println("nueve mil");
									        	    			   nuevo=numero-resta;
									        	    			   numero=nuevo;
									        	    			    }
									        	    	     	  else { 
										  	 	        	    		
										        	    	     	   if (numero<=199 && numero>=100)
										        	    		       {
										        	    			   resta=100;
										        	    			   resobtenido=resobtenido+" "+"ciento";
										        	    			   System.out.println("ciento");
										        	    			   nuevo=numero-resta;
										        	    			   numero=nuevo;
										        	    			    }
										        	    	     	  else { 
											  	 	        	    		
											        	    	     	   if (numero<=299 && numero>=200)
											        	    		       {
											        	    			   resta=200;
											        	    			   resobtenido=resobtenido+" "+"docientos";
											        	    			   System.out.println("docientos");
											        	    			   nuevo=numero-resta;
											        	    			   numero=nuevo;
											        	    			    }
											        	    	     	  else { 
												  	 	        	    		
												        	    	     	   if (numero<=399 && numero>=300)
												        	    		       {
												        	    			   resta=300;	
												        	    			   resobtenido=resobtenido+" "+"trecientos";
												        	    			   System.out.println("trecientos");
												        	    			   nuevo=numero-resta;
												        	    			   numero=nuevo;
												        	    			    }
												        	    	     	  else { 
													  	 	        	    		
													        	    	     	   if (numero<=499 && numero>=400)
													        	    		       {
													        	    			   resta=400;
													        	    			   resobtenido=resobtenido+" "+"Cuatrocientos";
													        	    			   System.out.println("Cuatrocientos");
													        	    			   nuevo=numero-resta;
													        	    			   numero=nuevo;
													        	    			    }
													        	    	     	  else { 
														  	 	        	    		
														        	    	     	   if (numero<=599 && numero>=500)
														        	    		       {
														        	    			   resta=500;	
														        	    			   resobtenido=resobtenido+" "+"quinientos";
														        	    			   System.out.println("quinientos");
														        	    			   nuevo=numero-resta;
														        	    			   numero=nuevo;
														        	    			    }
														        	    	     	  else { 
															  	 	        	    		
															        	    	     	   if (numero<=699 && numero>=600)
															        	    		       {
															        	    			   resta=600;	
															        	    			   resobtenido=resobtenido+" "+"seicientos";
															        	    			   System.out.println("seicientos");
															        	    			   nuevo=numero-resta;
															        	    			   numero=nuevo;
															        	    			    }
															        	    	     	  else { 
																  	 	        	    		
																        	    	     	   if (numero<=799 && numero>=700)
																        	    		       {
																        	    			   resta=700;	
																        	    			   resobtenido=resobtenido+" "+"setecientos";
																        	    			   System.out.println("setecientos");
																        	    			   nuevo=numero-resta;
																        	    			   numero=nuevo;
																        	    			    }
																        	    	     	  else { 
																	  	 	        	    		
																	        	    	     	   if (numero<=899 && numero>=800)
																	        	    		       {
																	        	    			   resta=800;	
																	        	    			   resobtenido=resobtenido+" "+"ochocientos";
																	        	    			   System.out.println("ochocientos");
																	        	    			   nuevo=numero-resta;
																	        	    			   numero=nuevo;
																	        	    			    }
																	        	    	     	  else { 
																		  	 	        	    		
																		        	    	     	   if (numero<=29 && numero>=20)
																		        	    		       {
																		        	    			   resta=20;
																		        	    			   resobtenido=resobtenido+" "+"veinte";
																		        	    			   System.out.println("veinte");
																		        	    			   nuevo=numero-resta;
																		        	    			   numero=nuevo;
																		        	    			    }
																		        	    	     	  else { 
																			  	 	        	    		
																			        	    	     	   if (numero<=39 && numero>=30)
																			        	    		       {
																			        	    			   resta=30;
																			        	    			   resobtenido=resobtenido+" "+"treinta";
																			        	    			   System.out.println("treinta");
																			        	    			   nuevo=numero-resta;
																			        	    			   numero=nuevo;
																			        	    			    }
																			        	    	     	  else { 
																				  	 	        	    		
																				        	    	     	   if (numero<=49 && numero>=40)
																				        	    		       {
																				        	    			   resta=40;
																				        	    			   resobtenido=resobtenido+" "+"cuarenta";
																				        	    			   System.out.println("cuarenta");
																				        	    			   nuevo=numero-resta;
																				        	    			   numero=nuevo;
																				        	    			    }
																				        	    	     	  else { 
																					  	 	        	    		
																					        	    	     	   if (numero<=59 && numero>=50)
																					        	    		       {
																					        	    			   resta=50;
																					        	    			   resobtenido=resobtenido+" "+"cincuenta";
																					        	    			   System.out.println("cincuenta");
																					        	    			   nuevo=numero-resta;
																					        	    			   numero=nuevo;
																					        	    			    }
																					        	    	     	  else { 
																						  	 	        	    		
																						        	    	     	   if (numero<=69 && numero>=60)
																						        	    		       {
																						        	    			   resta=60;	
																						        	    			   resobtenido=resobtenido+" "+"sesenta";
																						        	    			   System.out.println("sesenta");
																						        	    			   nuevo=numero-resta;
																						        	    			   numero=nuevo;
																						        	    			    }
																						        	    	     	  else { 
																							  	 	        	    		
																							        	    	     	   if (numero<=79 && numero>=70)
																							        	    		       {
																							        	    			   resta=70;
																							        	    			   resobtenido=resobtenido+" "+"setenta";
																							        	    			   System.out.println("setenta");
																							        	    			   nuevo=numero-resta;
																							        	    			   numero=nuevo;
																							        	    			    }
																							        	    	     	  else { 
																								  	 	        	    		
																								        	    	     	   if (numero<=89 && numero>=80)
																								        	    		       {
																								        	    			   resta=80;	
																								        	    			   resobtenido=resobtenido+" "+"ochenta";
																								        	    			   System.out.println("ochenta");
																								        	    			   nuevo=numero-resta;
																								        	    			   numero=nuevo;
																								        	    			    }
																								        	    	     	  else { 
																									  	 	        	    		
																									        	    	     	   if (numero<=99 && numero>=90)
																									        	    		       {
																									        	    			   resta=90;
																									        	    			   resobtenido=resobtenido+" "+"noventa";
																									        	    			   System.out.println("noventa");
																									        	    			   nuevo=numero-resta;
																									        	    			   numero=nuevo;
																									        	    			    }
																									        	    	     	  else { 
																										  	 	        	    		
																										        	    	     	   if (numero==10)
																										        	    		       {
																										        	    			   resta=10;
																										        	    			   resobtenido=resobtenido+" "+"diez";
																										        	    			   System.out.println("diez");
																										        	    			   nuevo=numero-resta;
																										        	    			   numero=nuevo;
																										        	    			    }
																										        	    	     	  else { 
																											  	 	        	    		
																											        	    	     	   if (numero==11)
																											        	    		       {
																											        	    			   resta=11;
																											        	    			   resobtenido=resobtenido+" "+"once";
																											        	    			   System.out.println("once");
																											        	    			   nuevo=numero-resta;
																											        	    			   numero=nuevo;
																											        	    			    }
																											        	    	     	  else { 
																												  	 	        	    		
																												        	    	     	   if (numero==12)
																												        	    		       {
																												        	    			   resta=12;	
																												        	    			   resobtenido=resobtenido+" "+"doce";
																												        	    			   System.out.println("doce");
																												        	    			   nuevo=numero-resta;
																												        	    			   numero=nuevo;
																												        	    			    }
																												        	    	     	  else { 
																													  	 	        	    		
																													        	    	     	   if (numero==13)
																													        	    		       {
																													        	    			   resta=13;
																													        	    			   resobtenido=resobtenido+" "+"trece";
																													        	    			   System.out.println("trece");
																													        	    			   nuevo=numero-resta;
																													        	    			   numero=nuevo;
																													        	    			    }
																													        	    	     	  else { 
																														  	 	        	    		
																														        	    	     	   if (numero==14)
																														        	    		       {
																														        	    			   resta=14;	
																														        	    			   resobtenido=resobtenido+" "+"catorce";
																														        	    			   System.out.println("catorce");
																														        	    			   nuevo=numero-resta;
																														        	    			   numero=nuevo;
																														        	    			    }
																														        	    	     	  else { 
																															  	 	        	    		
																															        	    	     	   if (numero==15)
																															        	    		       {
																															        	    			   resta=15;
																															        	    			   resobtenido=resobtenido+" "+"quince";
																															        	    			   System.out.println("quince");
																															        	    			   nuevo=numero-resta;
																															        	    			   numero=nuevo;
																															        	    			    }
																															        	    	     	  else { 
																																  	 	        	    		
																																        	    	     	   if (numero==16)
																																        	    		       {
																																        	    			   resta=16;	
																																        	    			   resobtenido=resobtenido+" "+"dieciseis";
																																        	    			   System.out.println("dieciseis");
																																        	    			   nuevo=numero-resta;
																																        	    			   numero=nuevo;
																																        	    			    }
																																        	    	     	  else { 
																																	  	 	        	    		
																																	        	    	     	   if (numero==17)
																																	        	    		       {
																																	        	    			   resta=17;
																																	        	    			   resobtenido=resobtenido+" "+"diecisiete";
																																	        	    			   System.out.println("diecisiete");
																																	        	    			   nuevo=numero-resta;
																																	        	    			   numero=nuevo;
																																	        	    			    }
																																	        	    	     	  else { 
																																		  	 	        	    		
																																		        	    	     	   if (numero==18)
																																		        	    		       {
																																		        	    			   resta=18;	
																																		        	    			   resobtenido=resobtenido+" "+"dieciocho";
																																		        	    			   System.out.println("dieciocho");
																																		        	    			   nuevo=numero-resta;
																																		        	    			   numero=nuevo;
																																		        	    			    }
																																		        	    	     	  else { 
																																			  	 	        	    		
																																			        	    	     	   if (numero==19)
																																			        	    		       {
																																			        	    			   resta=19;	
																																			        	    			   resobtenido=resobtenido+" "+"diecinueve";
																																			        	    			   System.out.println("diecinueve");
																																			        	    			   nuevo=numero-resta;
																																			        	    			   numero=nuevo;
																																			        	    			    }
																																			        	    	     	  else { 
																																				  	 	        	    		
																																				        	    	     	   if (numero==1)
																																				        	    		       {
																																				        	    			   resta=1;	
																																				        	    			   resobtenido=resobtenido+" "+"uno";
																																				        	    			   System.out.println("uno");
																																				        	    			   nuevo=numero-resta;
																																				        	    			   numero=nuevo;
																																				        	    			    }
																																				        	    	     	  else { 
																																					  	 	        	    		
																																					        	    	     	   if (numero==2)
																																					        	    		       {
																																					        	    			   resta=2;	
																																					        	    			   resobtenido=resobtenido+" "+"dos";
																																					        	    			   System.out.println("dos");
																																					        	    			   nuevo=numero-resta;
																																					        	    			   numero=nuevo;
																																					        	    			    }
																																					        	    	     	  else { 
																																						  	 	        	    		
																																						        	    	     	   if (numero==3)
																																						        	    		       {
																																						        	    			   resta=3;																																							        	    			   
																																						        	    			   resobtenido=resobtenido+" "+"tres";
																																						        	    			   System.out.println("tres");
																																						        	    			   nuevo=numero-resta;
																																						        	    			   numero=nuevo;
																																						        	    			    }
																																						        	    	     	  else { 
																																							  	 	        	    		
																																							        	    	     	   if (numero==4)
																																							        	    		       {
																																							        	    			   resta=4;	
																																							        	    			   resobtenido=resobtenido+" "+"cuatro";
																																							        	    			   System.out.println("cuatro");
																																							        	    			   nuevo=numero-resta;
																																							        	    			   numero=nuevo;
																																							        	    			    }
																																							        	    	     	  else { 
																																								  	 	        	    		
																																								        	    	     	   if (numero==5)
																																								        	    		       {
																																								        	    			   resta=5;	
																																								        	    			   resobtenido=resobtenido+" "+"cinco";
																																								        	    			   System.out.println("cinco");
																																								        	    			   nuevo=numero-resta;
																																								        	    			   numero=nuevo;
																																								        	    			    }
																																								        	    	     	  else { 
																																									  	 	        	    		
																																									        	    	     	   if (numero==6)
																																									        	    		       {
																																									        	    			   resta=6;
																																									        	    			   resobtenido=resobtenido+" "+"seis";
																																									        	    			   System.out.println("seis");
																																									        	    			   nuevo=numero-resta;
																																									        	    			   numero=nuevo;
																																									        	    			    }
																																									        	    	     	  else { 
																																										  	 	        	    		
																																										        	    	     	   if (numero==7)
																																										        	    		       {
																																										        	    			   resta=7;	
																																										        	    			   resobtenido=resobtenido+" "+"siete";
																																										        	    			   System.out.println("siete");
																																										        	    			   nuevo=numero-resta;
																																										        	    			   numero=nuevo;
																																										        	    			    }
																																										        	    	     	  else { 
																																											  	 	        	    		
																																											        	    	     	   if (numero==8)
																																											        	    		       {
																																											        	    			   resta=8;	
																																											        	    			   resobtenido=resobtenido+" "+"ocho";
																																											        	    			   System.out.println("ocho");
																																											        	    			   nuevo=numero-resta;
																																											        	    			   numero=nuevo;
																																											        	    			    }
																																											        	    	     	  else { 
																																												  	 	        	    		
																																												        	    	     	   if (numero==9)
																																												        	    		       {
																																												        	    			   resta=9;
																																												        	    			   resobtenido=resobtenido+" "+"nueve";
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
//System.out.println(resobtenido);

assertEquals(" ocho mil Cuatrocientos cincuenta tres",resobtenido);
	}

}
