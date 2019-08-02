import _ from "lodash";

import { data } from "../lodash/data";

let result = _.chain(data).groupBy('price').value();

//console.log(result);

console.log(_.chain(data).groupBy('priceType'));