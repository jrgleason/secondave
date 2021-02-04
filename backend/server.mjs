import { Application, Router } from "https://deno.land/x/oak/mod.ts";
import { format } from "https://deno.land/x/std/datetime/mod.ts";
const port = Deno.env.get("PORT") || 8000;
const secure = false;
const app = new Application();
const router = new Router();
router.get("/time", ctx =>{
	ctx.response.body = format(new Date(), "MM-dd-yyyy HH:mm");
})
app.use(router.routes());
app.use(router.allowedMethods());
app.addEventListener("listen", str => {
	console.log(
		`Listening on: ${str.secure ? "https://" : "http://"}${str.hostname ??
		"localhost"}:${str.port}`,
	);
});
await app.listen({
	port, secure
});
