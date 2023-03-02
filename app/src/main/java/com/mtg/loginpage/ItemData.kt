package com.mtg.loginpage

class ItemData {
    public val data = arrayOf(
        arrayOf(
            R.drawable.crystal,
            "65 Crystal",
            "Rp16.000",
            "Honkai Impact"
        ),
        arrayOf(
            R.drawable.crystal,
            "330 Crystal",
            "Rp79.000",
            "Honkai Impact"
        ),
        arrayOf(
            R.drawable.crystal,
            "660 Crystal",
            "Rp159.000",
            "Honkai Impact"
        ),
        arrayOf(
            R.drawable.crystal,
            "1320 Crystal",
            "Rp329.000",
            "Honkai Impact"
        ),
        arrayOf(
            R.drawable.crystal,
            "3300 Crystal",
            "Rp799.000",
            "Honkai Impact"
        ),
        arrayOf(
            R.drawable.crystal,
            "6600 Crystal",
            "Rp1.599.000",
            "Honkai Impact"
        )
    )

    val listData: ArrayList<Item>
        get() {
            val list = arrayListOf<Item>()
            for(aData in data){
                val item = Item()
                item.photo = aData[0] as Int
                item.name = aData[1] as String
                item.harga = aData[2] as String
                item.game = aData[3] as String

                list.add(item)
            }
            return list
        }
}