import express from "express";
import { routes } from "../routes";
import {
  api_documentation,
  api_v1_buy,
  api_v1_refund,
  api_v2_remove,
  api_v2_edit
} from "../controllers/apiController";

const apiRouter = express();

apiRouter.get(routes.api_documentation, api_documentation);
apiRouter.get(routes.api_v1_buy, api_v1_buy);
apiRouter.get(routes.api_v1_refund, api_v1_refund);
apiRouter.get(routes.api_v2_remove, api_v2_remove);
apiRouter.get(routes.api_v2_edit, api_v2_edit);

export default apiRouter;
