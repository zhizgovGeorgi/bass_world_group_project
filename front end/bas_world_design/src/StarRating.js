import React from "react";
import './StarRating.scss'

const StarRating = () =>{
    return(
       <main>
            <div class="rating">

                <input type="radio" name="rating" id="r1"/>
                <label for="r1"></label>

                <input type="radio" name="rating" id="r2"/>
                <label for="r2"></label>

                <input type="radio" name="rating" id="r3"/>
                <label for="r3"></label>

                <input type="radio" name="rating" id="r4"/>
                <label for="r4"></label>

                <input type="radio" name="rating" id="r5"/>
                <label for="r5"></label>
            </div>
       </main>
    )
}

export default StarRating;