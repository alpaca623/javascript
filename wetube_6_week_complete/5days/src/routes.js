/**
 * route list
 * - home
 * - join
 * - login
 * - confirm-account
 * - course
 * - api
 */

// home
const HOME = "/";
// join
const JOIN = "/join";
// login
const LOGIN = "/login";

// confirm-account
const CONFIRM_ACCOUNT = "/confirm-account";

// courses
const COURSES = "/courses";
const COURSES_NEW = "/new";
const COURSES_MINE = "/mine";

// api
const API = "/api";
const API_DOCUMENTATION = "/documentation";
const API_V1_BUY = "/v1/buy";
const API_V1_REFUND = "/v1/refund";
const API_V2_REMOVE = "/v2/remove";
const API_V2_EDIT = "/v2/edit";

export const routes = {
  home: HOME,
  join: JOIN,
  login: LOGIN,
  confirm_account: CONFIRM_ACCOUNT,
  courses: COURSES,
  courses_new: COURSES_NEW,
  courses_mine: COURSES_MINE,
  api: API,
  api_documentation: API_DOCUMENTATION,
  api_v1_buy: API_V1_BUY,
  api_v1_refund: API_V1_REFUND,
  api_v2_remove: API_V2_REMOVE,
  api_v2_edit: API_V2_EDIT
};
