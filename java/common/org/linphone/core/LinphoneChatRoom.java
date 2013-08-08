/*
LinphoneChatRoom.java
Copyright (C) 2010  Belledonne Communications, Grenoble, France

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/
package org.linphone.core;
/**
 * 
 * A chat room is the place where text messages are exchanged. 
Can be created by linphone_core_create_chat_room().
 *
 */
public interface LinphoneChatRoom {
	/**
	 * get peer address associated to this LinphoneChatRoom
	 *
	 * @return LinphoneAddress peer address
	 */
	LinphoneAddress getPeerAddress();
	/**
	* send a message to peer member of this chat room.
	* @param  	message to be sent
	*/
	void sendMessage(String message);
	/**
	 * Send a message to peer member of this chat room.
	 * @param chat message
	 */
	void sendMessage(LinphoneChatMessage message, LinphoneChatMessage.StateListener listener);
	
	/**
	 * Create a LinphoneChatMessage
	 * @param chatRoom chat room associated to the message
	 * @param message message to send
	 * @return LinphoneChatMessage object
	 */
	LinphoneChatMessage createLinphoneChatMessage(String message);
	
	/**
	 * Returns the chat history associated with the peer address associated with this chat room
	 * @return an array of LinphoneChatMessage
	 */
	LinphoneChatMessage[] getHistory();
}
