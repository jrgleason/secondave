import { Application, Router } from "https://deno.land/x/oak/mod.ts";

const port = Deno.env.get("PORT") || 8000;
const app = new Application();
const router = new Router();
router.get("/deno", ctx =>{
	ctx.response.body = "This is deno";
})
app.use(router.routes());
app.use(router.allowedMethods());
await app.listen({ port });
