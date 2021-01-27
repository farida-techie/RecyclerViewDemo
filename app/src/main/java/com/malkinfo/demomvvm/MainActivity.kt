package com.malkinfo.demomvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.malkinfo.demomvvm.model.UserDAta
import com.malkinfo.demomvvm.view.adapter.MyAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var userAdapter:MyAdapter
    private lateinit var myRecycler:RecyclerView
    private lateinit var userList:ArrayList<UserDAta>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**set Id*/
        myRecycler = findViewById(R.id.myRecycler)
        userList = ArrayList<UserDAta>()
        userAdapter = MyAdapter(userList)
        myRecycler.layoutManager = LinearLayoutManager(this)
        myRecycler.adapter = userAdapter
        listUser()

    }
    fun listUser(){
        userList.add(UserDAta(R.drawable.watermelon,"1. Watermelon:","2 ½ cups diced (350 grams): 100 calories and 25 grams sugar"))
        userList.add(UserDAta(R.drawable.strawberry,"2. Strawberry:","About 2 cups or 16 medium berries (294 grams): 100 calories and 14.3 grams sugar"))
        userList.add(UserDAta(R.drawable.cantaloupe,"3. Cantaloupe:","About half a medium melon (268 grams): 100 calories and 22 grams sugar"))
        userList.add(UserDAta(R.drawable.peach,"4. Peach: ","1 ¾ peaches (245 grams): 100 calories and 26.67 grams sugar"))
        userList.add(UserDAta(R.drawable.blackberry,"5. Blackberry:","About 1 ½ cups (232.3 grams): 100 calories and 11.3 grams sugar"))
        userList.add(UserDAta(R.drawable.pineapple,"6. Pineapple: ","1 ⅓ cups of chunks (224 grams): 100 calories and 20 grams sugar"))
        userList.add(UserDAta(R.drawable.plum,"7. Plum: ","About two small plums (215.7 grams): 100 calories and 22.8 grams sugar"))
        userList.add(UserDAta(R.drawable.orange,"8. Orange: ","About 1 ¼ oranges (192.5 grams): 100 calories and 17.5 grams sugar"))
        userList.add(UserDAta(R.drawable.raspberry,"9. Raspberry:","About 1 ½ cups (190 grams): 100 calories and 7.8 grams sugar"))
        userList.add(UserDAta(R.drawable.apples,"10. Apples:","About one medium apple (186 grams): 100 calories and19.23 grams sugar"))
        userList.add(UserDAta(R.drawable.blueberry,"11. Blueberry:","About 1 ⅕ cups (174 grams): 100 calories and 17.64 grams sugar"))
        userList.add(UserDAta(R.drawable.pear,"12. Pear:","One medium pear (166 grams): 100 calories and 16 grams sugar"))
        userList.add(UserDAta(R.drawable.kiwi,"13. Kiwi:","About three small-to-medium kiwis (164.4 grams): 100 calories and 14.44 grams sugar"))
        userList.add(UserDAta(R.drawable.cherry,"14. Cherry: ","1 cup or about 21 cherries (140 grams): 100 calories and 6 grams sugar"))
        userList.add(UserDAta(R.drawable.grape,"15. Grape:","About 24 grapes or ¾ cup (140 grams): 100 calories and 22.2 grams sugar"))
        userList.add(UserDAta(R.drawable.banana,"16. Banana: ","About four-fifths of one medium banana (114.55 grams): 100 calories and 17.27 grams sugar"))
        userList.add(UserDAta(R.drawable.avocado,"17. Avocado: ","About three-fifths of one small avocado (60 grams): 100 calories and 0 grams sugar"))

    }
}