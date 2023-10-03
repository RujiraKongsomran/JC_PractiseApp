package com.rujirakongsomran.jc_practiseapp.repository

import com.rujirakongsomran.jc_practiseapp.model.Photo

class PhotoRepository {
    fun getAllData() =
        listOf(
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2017/09/25/13/12/puppy-2785074_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2016/02/18/18/37/puppy-1207816_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2015/11/17/13/13/puppy-1047521_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2018/05/11/08/11/dog-3389729_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2017/07/31/21/15/dog-2561134_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2014/04/05/11/40/dog-316598_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2016/05/09/10/42/weimaraner-1381186_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2017/06/24/09/13/continental-bulldog-2437110_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2018/03/31/06/31/dog-3277414_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2016/04/17/10/38/doberman-1334497_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2023/09/19/12/34/dog-8262506_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2014/12/10/05/50/english-bulldog-562723_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2019/09/10/09/23/dog-4465690_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2021/01/21/16/17/english-cocker-spaniel-5937757_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2017/12/29/10/47/animal-company-3047244_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2018/03/18/18/06/australian-shepherd-3237735_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2016/11/22/23/13/dog-1851107_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2020/06/30/22/34/dog-5357794_1280.jpg")
        )
}