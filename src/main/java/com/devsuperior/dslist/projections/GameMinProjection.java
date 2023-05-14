/**
 * 
 */
package com.devsuperior.dslist.projections;

/**
 * @author jemsa
 *
 */
public interface GameMinProjection {

	Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();

}
