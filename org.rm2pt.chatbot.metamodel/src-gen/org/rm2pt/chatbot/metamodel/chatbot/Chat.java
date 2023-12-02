/**
 */
package org.rm2pt.chatbot.metamodel.chatbot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.chatbot.metamodel.chatbot.Chat#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.chatbot.metamodel.chatbot.ChatbotPackage#getChat()
 * @model
 * @generated
 */
public interface Chat extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference list.
	 * The list contents are of type {@link org.rm2pt.chatbot.metamodel.chatbot.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference list.
	 * @see org.rm2pt.chatbot.metamodel.chatbot.ChatbotPackage#getChat_Message()
	 * @model derived="true"
	 * @generated
	 */
	EList<Message> getMessage();

} // Chat
