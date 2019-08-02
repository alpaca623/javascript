

import app from './src/server';
import './src/db';

app.listen(4000, () => console.log("server open!"));