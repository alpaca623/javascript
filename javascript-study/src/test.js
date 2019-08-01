import _ from "lodash";

import { data } from "./data";

let result = _.chain(data).groupBy('price').value();

console.log(result);
