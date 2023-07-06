package com.example.tweetsassignment


class ContactAdapter(private val contactList: List<Contact>) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    // Inner class representing the ViewHolder for each contact item
    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Define the UI elements for each contact item
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val phoneNumberTextView: TextView = itemView.findViewById(R.id.phoneNumberTextView)
        val emailTextView: TextView = itemView.findViewById(R.id.emailTextView)
    }

    // Create the ViewHolder for the contact item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ContactViewHolder(itemView)
    }

    // Bind the data to the ViewHolder
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact = contactList[position]
        holder.nameTextView.text = currentContact.name
        holder.phoneNumberTextView.text = currentContact.phoneNumber
        holder.emailTextView.text = currentContact.email
    }

    // Return the number of items in the list
    override fun getItemCount(): Int {
        return contactList.size
    }
}