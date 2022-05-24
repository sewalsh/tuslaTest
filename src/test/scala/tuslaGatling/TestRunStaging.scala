package tuslaGatling

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class TestRunStaging extends Simulation {

	val httpProtocol = http
		.baseUrl("https://tcmapistaging.tuslairl.net")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en-GB-oxendict;q=0.9,en;q=0.8")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.67 Safari/537.36")

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="101", "Google Chrome";v="101""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

	val headers_1 = Map(
		"0" -> "[object Object]",
		"content-type" -> "application/json",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="101", "Google Chrome";v="101""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_2 = Map(
		"access-control-request-headers" -> "abp.tenantid,content-type",
		"access-control-request-method" -> "GET",
		"origin" -> "https://tcmstaging.tuslairl.net",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_3 = Map(
		"abp.tenantid" -> "1",
		"content-type" -> "application/json",
		"origin" -> "https://tcmstaging.tuslairl.net",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="101", "Google Chrome";v="101""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_4 = Map(
		"access-control-request-headers" -> "abp.tenantid,cache-control,expires,pragma,x-requested-with",
		"access-control-request-method" -> "GET",
		"origin" -> "https://tcmstaging.tuslairl.net",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_5 = Map(
		"abp.tenantid" -> "1",
		"accept" -> "text/plain",
		"expires" -> "Sat, 01 Jan 2000 00:00:00 GMT",
		"origin" -> "https://tcmstaging.tuslairl.net",
		"pragma" -> "no-cache",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="101", "Google Chrome";v="101""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_10 = Map(
		"access-control-request-headers" -> "abp.tenantid,cache-control,content-type,expires,pragma,x-requested-with",
		"access-control-request-method" -> "POST",
		"origin" -> "https://tcmstaging.tuslairl.net",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_11 = Map(
		"abp.tenantid" -> "1",
		"accept" -> "text/plain",
		"content-type" -> "application/json-patch+json",
		"expires" -> "Sat, 01 Jan 2000 00:00:00 GMT",
		"origin" -> "https://tcmstaging.tuslairl.net",
		"pragma" -> "no-cache",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="101", "Google Chrome";v="101""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_14 = Map(
		"access-control-request-headers" -> "abp.tenantid,authorization,content-type",
		"access-control-request-method" -> "GET",
		"origin" -> "https://tcmstaging.tuslairl.net",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_15 = Map(
		"abp.tenantid" -> "1",
		"authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1laWRlbnRpZmllciI6IjEwMDAyIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6IkFsYW4uQm95Y2UiLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9lbWFpbGFkZHJlc3MiOiJBbGFuLkJveWNlQHR1c2xhLmllIiwiQXNwTmV0LklkZW50aXR5LlNlY3VyaXR5U3RhbXAiOiJaRjZSRlBYN0VWSk9WV1ZBTU5WU0lTTVpKU0NDWEVGUSIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvcm9sZSI6IkFkbWluIiwiaHR0cDovL3d3dy5hc3BuZXRib2lsZXJwbGF0ZS5jb20vaWRlbnRpdHkvY2xhaW1zL3RlbmFudElkIjoiMSIsInN1YiI6IjEwMDAyIiwianRpIjoiOTdlNzY2ZGUtZDA0OS00ZmUzLWJjNTQtY2EzZjc0NDE4MmQ1IiwiaWF0IjoxNjUzMzg2OTU5LCJ0b2tlbl92YWxpZGl0eV9rZXkiOiIyOWNjMTkwYi1mNjNjLTRhMWUtODM3MC1iMGZjNmQxNDExNDQiLCJ1c2VyX2lkZW50aWZpZXIiOiIxMDAwMkAxIiwidG9rZW5fdHlwZSI6IjAiLCJyZWZyZXNoX3Rva2VuX3ZhbGlkaXR5X2tleSI6ImE0MTIxNDc2LTYwZDEtNDNhNy05MGZiLTJhMTM5OTE0MjUyZSIsIm5iZiI6MTY1MzM4Njk1OSwiZXhwIjoxNjUzNDczMzU5LCJpc3MiOiJUQ00iLCJhdWQiOiJUQ00ifQ.reV7Hr0eG3TVt73H13gVYbwpQL9eREMelquIbufIARM",
		"content-type" -> "application/json",
		"origin" -> "https://tcmstaging.tuslairl.net",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="101", "Google Chrome";v="101""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_16 = Map(
		"access-control-request-headers" -> "abp.tenantid,authorization,cache-control,expires,pragma,x-requested-with",
		"access-control-request-method" -> "GET",
		"origin" -> "https://tcmstaging.tuslairl.net",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_17 = Map(
		"abp.tenantid" -> "1",
		"accept" -> "text/plain",
		"authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1laWRlbnRpZmllciI6IjEwMDAyIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6IkFsYW4uQm95Y2UiLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9lbWFpbGFkZHJlc3MiOiJBbGFuLkJveWNlQHR1c2xhLmllIiwiQXNwTmV0LklkZW50aXR5LlNlY3VyaXR5U3RhbXAiOiJaRjZSRlBYN0VWSk9WV1ZBTU5WU0lTTVpKU0NDWEVGUSIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvcm9sZSI6IkFkbWluIiwiaHR0cDovL3d3dy5hc3BuZXRib2lsZXJwbGF0ZS5jb20vaWRlbnRpdHkvY2xhaW1zL3RlbmFudElkIjoiMSIsInN1YiI6IjEwMDAyIiwianRpIjoiOTdlNzY2ZGUtZDA0OS00ZmUzLWJjNTQtY2EzZjc0NDE4MmQ1IiwiaWF0IjoxNjUzMzg2OTU5LCJ0b2tlbl92YWxpZGl0eV9rZXkiOiIyOWNjMTkwYi1mNjNjLTRhMWUtODM3MC1iMGZjNmQxNDExNDQiLCJ1c2VyX2lkZW50aWZpZXIiOiIxMDAwMkAxIiwidG9rZW5fdHlwZSI6IjAiLCJyZWZyZXNoX3Rva2VuX3ZhbGlkaXR5X2tleSI6ImE0MTIxNDc2LTYwZDEtNDNhNy05MGZiLTJhMTM5OTE0MjUyZSIsIm5iZiI6MTY1MzM4Njk1OSwiZXhwIjoxNjUzNDczMzU5LCJpc3MiOiJUQ00iLCJhdWQiOiJUQ00ifQ.reV7Hr0eG3TVt73H13gVYbwpQL9eREMelquIbufIARM",
		"expires" -> "Sat, 01 Jan 2000 00:00:00 GMT",
		"origin" -> "https://tcmstaging.tuslairl.net",
		"pragma" -> "no-cache",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="101", "Google Chrome";v="101""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_18 = Map(
		"access-control-request-headers" -> "abp.tenantid,authorization,cache-control,expires,pragma,x-requested-with",
		"access-control-request-method" -> "POST",
		"origin" -> "https://tcmstaging.tuslairl.net",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_25 = Map(
		"access-control-request-headers" -> "x-requested-with,x-signalr-user-agent",
		"access-control-request-method" -> "POST",
		"origin" -> "https://tcmstaging.tuslairl.net",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_29 = Map(
		"origin" -> "https://tcmstaging.tuslairl.net",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="101", "Google Chrome";v="101""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "font",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_30 = Map(
		"content-type" -> "text/plain;charset=UTF-8",
		"origin" -> "https://tcmstaging.tuslairl.net",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="101", "Google Chrome";v="101""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site",
		"x-requested-with" -> "XMLHttpRequest",
		"x-signalr-user-agent" -> "Microsoft SignalR/5.0 (5.0.10; Unknown OS; Browser; Unknown Runtime Version)")

	val headers_52 = Map(
		"access-control-request-headers" -> "x-requested-with,x-signalr-user-agent",
		"access-control-request-method" -> "GET",
		"origin" -> "https://tcmstaging.tuslairl.net",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

    val uri2 = "https://tcmstaging.tuslairl.net"

	val scn = scenario("TestRunStaging")
		.exec(http("/account/login")
			.get(uri2 + "/account/login")
			.headers(headers_0)
			.resources(http("/assets/appconfig.production.json?d=1653386917456")
			.get(uri2 + "/assets/appconfig.production.json?d=1653386917456")
			.headers(headers_1),
            http("/AbpUserConfiguration/GetAll?d=1653386917598")
			.options("/AbpUserConfiguration/GetAll?d=1653386917598")
			.headers(headers_2),
            http("/AbpUserConfiguration/GetAll?d=1653386917598")
			.get("/AbpUserConfiguration/GetAll?d=1653386917598")
			.headers(headers_3),
            http("/api/services/app/Session/GetCurrentLoginInformations")
			.options("/api/services/app/Session/GetCurrentLoginInformations")
			.headers(headers_4),
            http("/api/services/app/Session/GetCurrentLoginInformations")
			.get("/api/services/app/Session/GetCurrentLoginInformations")
			.headers(headers_5),
            http("/api/TokenAuth/GetExternalAuthenticationProviders")
			.options("/api/TokenAuth/GetExternalAuthenticationProviders")
			.headers(headers_4),
            http("/api/TokenAuth/GetExternalAuthenticationProviders")
			.options("/api/TokenAuth/GetExternalAuthenticationProviders")
			.headers(headers_4),
            http("/api/TokenAuth/GetExternalAuthenticationProviders")
			.get("/api/TokenAuth/GetExternalAuthenticationProviders")
			.headers(headers_5),
            http("/api/TokenAuth/GetExternalAuthenticationProviders")
			.get("/api/TokenAuth/GetExternalAuthenticationProviders")
			.headers(headers_5)))
		.pause(12)
		.exec(http("/api/TokenAuth/Authenticate")
			.options("/api/TokenAuth/Authenticate")
			.headers(headers_10)
			.resources(http("/api/TokenAuth/Authenticate")
			.post("/api/TokenAuth/Authenticate")
			.headers(headers_11)
			.body(RawFileBody("tuslaGatling/testrunstaging/0011_request.dat")),
            http("request_12")
			.get(uri2 + "/")
			.headers(headers_0),
            http("/assets/appconfig.production.json?d=1653386935306")
			.get(uri2 + "/assets/appconfig.production.json?d=1653386935306")
			.headers(headers_1),
            http("/AbpUserConfiguration/GetAll?d=1653386935431")
			.options("/AbpUserConfiguration/GetAll?d=1653386935431")
			.headers(headers_14),
            http("/AbpUserConfiguration/GetAll?d=1653386935431")
			.get("/AbpUserConfiguration/GetAll?d=1653386935431")
			.headers(headers_15),
            http("/api/services/app/Session/GetCurrentLoginInformations")
			.options("/api/services/app/Session/GetCurrentLoginInformations")
			.headers(headers_16),
            http("/api/services/app/Session/GetCurrentLoginInformations")
			.get("/api/services/app/Session/GetCurrentLoginInformations")
			.headers(headers_17)))
		.pause(1)
		.exec(http("/api/services/app/TCMRecordSets/UseReferralOrCaseTerm")
			.options("/api/services/app/TCMRecordSets/UseReferralOrCaseTerm")
			.headers(headers_18)
			.resources(http("/api/services/app/TCMOrganizationUnit/UserHasOrganizationUnit")
			.options("/api/services/app/TCMOrganizationUnit/UserHasOrganizationUnit")
			.headers(headers_18),
            http("/api/services/app/Notification/GetUserNotifications?SkipCount=0")
			.options("/api/services/app/Notification/GetUserNotifications?SkipCount=0")
			.headers(headers_16),
            http("/api/services/app/Profile/GetProfilePicture")
			.options("/api/services/app/Profile/GetProfilePicture")
			.headers(headers_16),
            http("api/services/app/UserLink/GetRecentlyUsedLinkedUsers")
			.options("/api/services/app/UserLink/GetRecentlyUsedLinkedUsers")
			.headers(headers_16),
            http("/api/services/app/DashboardCustomization/GetDashboardDefinition?DashboardName=TenantDashboard&Application=Angular")
			.options("/api/services/app/DashboardCustomization/GetDashboardDefinition?DashboardName=TenantDashboard&Application=Angular")
			.headers(headers_16),
            http("/api/services/app/Profile/GetProfilePicture")
			.options("/api/services/app/Profile/GetProfilePicture")
			.headers(headers_16),
            http("/signalr-chat/negotiate?enc_auth_token=")
			.options("/signalr-chat/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_25),
            http("/signalr-chat/negotiate?enc_auth_token=")
			.options("/signalr/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_25),
            http("/api/services/app/Profile/GetProfilePicture")
			.get("/api/services/app/Profile/GetProfilePicture")
			.headers(headers_17),
            http("/api/services/app/Profile/GetProfilePicture")
			.get("/api/services/app/Profile/GetProfilePicture")
			.headers(headers_17),
            http("/line-awesome.4b43b038741cb489a502.woff2?v=1.1.")
			.get(uri2 + "/line-awesome.4b43b038741cb489a502.woff2?v=1.1.")
			.headers(headers_29),
            http("/signalr/negotiate?enc_auth_token=")
			.post("/signalr/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_30),
            http("/signalr/negotiate?enc_auth_token=")
			.post("/signalr-chat/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_30),
            http("/signalr/negotiate?enc_auth_token=")
			.options("/signalr-chat/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_25),
            http("/signalr/negotiate?enc_auth_token=")
			.options("/signalr/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_25),
            http("/signalr/negotiate?enc_auth_token=")
			.post("/signalr/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_30),
            http("/signalr/negotiate?enc_auth_token=")
			.post("/signalr-chat/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_30),
            http("/api/services/app/TCMRecordSets/UseReferralOrCaseTerm")
			.post("/api/services/app/TCMRecordSets/UseReferralOrCaseTerm")
			.headers(headers_17),
            http("/api/services/app/TCMOrganizationUnit/UserHasOrganizationUnit")
			.post("/api/services/app/TCMOrganizationUnit/UserHasOrganizationUnit")
			.headers(headers_17),
            http("/api/services/app/DashboardCustomization/GetDashboardDefinition?DashboardName=TenantDashboard&Application=Angular")
			.get("/api/services/app/DashboardCustomization/GetDashboardDefinition?DashboardName=TenantDashboard&Application=Angular")
			.headers(headers_17),
            http("/api/services/app/Notification/GetUserNotifications?SkipCount=0")
			.get("/api/services/app/Notification/GetUserNotifications?SkipCount=0")
			.headers(headers_17),
            http("/signalr/negotiate?enc_auth_token=")
			.options("/signalr/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_25),
            http("/signalr-chat/negotiate?enc_auth_token=")
			.options("/signalr-chat/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_25),
            http("/signalr-chat/negotiate?enc_auth_token=")
			.post("/signalr/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_30),
            http("/signalr-chat/negotiate?enc_auth_token=")
			.post("/signalr-chat/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_30),
            http("/api/services/app/TCMCases/GetAllMyOpenCases")
			.options("/api/services/app/TCMCases/GetAllMyOpenCases")
			.headers(headers_16),
            http("/api/services/app/TCMTasks/GetAllMyOpenTasks")
			.options("/api/services/app/TCMTasks/GetAllMyOpenTasks")
			.headers(headers_16),
            http("/api/services/app/TCMTasks/GetTeamTasksSummary")
			.options("/api/services/app/TCMTasks/GetTeamTasksSummary")
			.headers(headers_16),
            http("/api/services/app/TCMTasks/GetMyTasksSummary")
			.options("/api/services/app/TCMTasks/GetMyTasksSummary")
			.headers(headers_16),
            http("/signalr/negotiate?enc_auth_token=")
			.options("/signalr/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_25),
            http("/signalr/negotiate?enc_auth_token=")
			.post("/signalr/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_30),
            http("/signalr/negotiate?enc_auth_token=")
			.options("/signalr-chat/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_25),
            http("/api/services/app/UserLink/GetRecentlyUsedLinkedUsers")
			.get("/api/services/app/UserLink/GetRecentlyUsedLinkedUsers")
			.headers(headers_17),
            http("/signalr?enc_auth_token=")
			.options("/signalr?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=mJA49J7FtzxdI9hhyED2Cw&_=1653386942397")
			.headers(headers_52),
            http("/api/services/app/TCMTasks/GetAllMyOpenTasks")
			.get("/api/services/app/TCMTasks/GetAllMyOpenTasks")
			.headers(headers_17),
            http("/signalr-chat/negotiate?enc_auth_token=")
			.post("/signalr-chat/negotiate?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&negotiateVersion=1")
			.headers(headers_30),
            http("/api/services/app/TCMTasks/GetMyTasksSummary")
			.get("/api/services/app/TCMTasks/GetMyTasksSummary")
			.headers(headers_17),
            http("/api/services/app/TCMCases/GetAllMyOpenCases")
			.get("/api/services/app/TCMCases/GetAllMyOpenCases")
			.headers(headers_17),
            http("/api/services/app/TCMTasks/GetTeamTasksSummary")
			.get("/api/services/app/TCMTasks/GetTeamTasksSummary")
			.headers(headers_17),
            http("/signalr-chat?enc_auth_token=")
			.options("/signalr-chat?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=sIsAUzPVQF-pjsc-qsungQ&_=1653386942594")
			.headers(headers_52),
            http("/signalr?enc_auth_token=")
			.get("/signalr?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=mJA49J7FtzxdI9hhyED2Cw&_=1653386942397")
			.headers(headers_30),
            http("/signalr?enc_auth_token=")
			.get("/signalr-chat?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=sIsAUzPVQF-pjsc-qsungQ&_=1653386942594")
			.headers(headers_30),
            http("/signalr?enc_auth_token=")
			.options("/signalr?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=mJA49J7FtzxdI9hhyED2Cw&_=1653386942778")
			.headers(headers_52),
            http("/signalr?enc_auth_token=")
			.options("/signalr?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=mJA49J7FtzxdI9hhyED2Cw")
			.headers(headers_25),
            http("/api/services/app/TCMOrganizationUnit/GetUserOrganizationUnits")
			.options("/api/services/app/TCMOrganizationUnit/GetUserOrganizationUnits")
			.headers(headers_16),
            http("/api/services/app/TCMCases/GetAll?Filter=&EntityId=0&ShowAll=false&Sorting=lastModificationTime%20DESC&SkipCount=0&MaxResultCount=10")
			.options("/api/services/app/TCMCases/GetAll?Filter=&EntityId=0&ShowAll=false&Sorting=lastModificationTime%20DESC&SkipCount=0&MaxResultCount=10")
			.headers(headers_16),
            http("/signalr?enc_auth_token=w")
			.post("/signalr?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=mJA49J7FtzxdI9hhyED2Cw")
			.headers(headers_30)
			.body(RawFileBody("tuslaGatling/testrunstaging/0065_request.txt")),
            http("/signalr?enc_auth_token=wNYm")
			.get("/signalr?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=mJA49J7FtzxdI9hhyED2Cw&_=1653386942778")
			.headers(headers_30),
            http("/signalr-chat?enc_auth_token=")
			.options("/signalr-chat?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=sIsAUzPVQF-pjsc-qsungQ&_=1653386943068")
			.headers(headers_52),
            http("/signalr-chat?enc_auth_token=")
			.options("/signalr-chat?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=sIsAUzPVQF-pjsc-qsungQ")
			.headers(headers_25),
            http("/signalr?enc_auth_token=")
			.options("/signalr?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=mJA49J7FtzxdI9hhyED2Cw&_=1653386943165")
			.headers(headers_52),
            http("/signalr?enc_auth_token=")
			.options("/signalr?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=mJA49J7FtzxdI9hhyED2Cw")
			.headers(headers_25),
            http("/signalr-chat?enc_auth_token=w")
			.post("/signalr-chat?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=sIsAUzPVQF-pjsc-qsungQ")
			.headers(headers_30)
			.body(RawFileBody("tuslaGatling/testrunstaging/0071_request.txt")),
            http("/signalr-chat?enc_auth_token=w")
			.get("/signalr-chat?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=sIsAUzPVQF-pjsc-qsungQ&_=1653386943068")
			.headers(headers_30),
            http("/signalr?enc_auth_token=w")
			.post("/signalr?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=mJA49J7FtzxdI9hhyED2Cw")
			.headers(headers_30)
			.body(RawFileBody("tuslaGatling/testrunstaging/0073_request.txt")),
            http("/signalr?enc_auth_token=w")
			.get("/signalr?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=mJA49J7FtzxdI9hhyED2Cw&_=1653386943165")
			.headers(headers_30),
            http("/api/services/app/TCMOrganizationUnit/GetUserOrganizationUnits")
			.get("/api/services/app/TCMOrganizationUnit/GetUserOrganizationUnits")
			.headers(headers_17),
            http("signalr-chat?enc_auth_token=w")
			.options("/signalr-chat?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=sIsAUzPVQF-pjsc-qsungQ&_=1653386943434")
			.headers(headers_52),
            http("/api/services/app/Chat/GetUserChatFriendsWithSetting")
			.options("/api/services/app/Chat/GetUserChatFriendsWithSettings")
			.headers(headers_16),
            http("/signalr?enc_auth_token=wNY")
			.options("/signalr?enc_auth_token=wNYmO41%2F48SHNstaLVXxHCCre29BZQl1NhC6NM3R3rzpXtPQxVzH6jEzA%2FQhXFN5tu6Fk7pO53uppm1mVXMZgxbyRVz26dnepi%2FFyB6axBY%2B6gq1GL%2BuRQgoiFUCjRN2p8w6LevViwKlHyWZZJZO1DGVSjAi1m2U%2Bog9pkHw9%2FTVeh7XStT0EV%2BQl4pT6sH5fsMRIM6f2umKmixIggWwpqC1uQ9LObTPnRCCaJSWMb99mFexpTjqZV5uxCJYeYHL%2FFae05SCuXQvhxpmCS6PB61D3NrNjHbr0xHdPrvvxDP2aMv15S7MNdSWYn2Q1MJYJCq4%2FDd%2F0A%2FPhOBdqNh9oDxAfXx4walpppm0zjl0srONG3TiPEWhSGeTlbvcmjGUoK6E2KqsdbQh%2BHVgNgd1DDoMCf4EcktoandkwBOpBbC2kVyoG2fs7%2FON%2BfKDDuD%2BmKTQxtkHMxqjVOSHzTpNKw8PW%2BRr2YW3eU6JZLB5GNHg%2FSMFd4zxCVD5j%2B8Sj3OvsciOqouYNxLwFn9ydPFkIVfzefQIs%2B2l58JTKAIM1x%2B1sDg2c5TG6Po7en458kEko%2BlxkLCmaMiE7J%2FqKf%2FutglpiqwHGctRon2svWERHcYgwOH2Vzm31lHNXRECoo9VgIQIX4lZZW2DUGExnfrBg2Vy0OdVJUybJPhKUMeTKGZLW4OSDqYDkN3xwGa%2FOk3dtKdEpaBfOBTIpY65oNK%2FyGA8YpESXGCmpjv8wc9vXEVALpupmAUXxuQuAtj%2BwNK74MD0uVGz0euGVhZkz3fGsg%2BQeq4DWULo%2F1XJ5pHz8sTPfplH891snxyBALdZwyQZeJxVh34XvDOaaJ7pcM5rTcHt0vyfTpn%2FM3W71xSCcAG1x3Nkdy40GMUhXzFAsGLkJXztvfjIeXZJmASr5nQtbup0E%2BHNnLRV78E9YbFVdjG6dJqh7WAiApXgyWASSoLzVz%2B%2Fb35yr0T%2BSZngaC8LQzQmzPylXAGsYNxhZD6p8mcxBhc0C2L1iX8RxsjEg%2B%2Fc7r%2B0fIx2cRJyJmXMVBn%2BwAIquE98I5UCKhgJ563jj6LH8Rdhxda83Ja7uy%2BBd0fYVDvnpc9RV74jZx2w%2BQc43CgkVyUuB8f%2FCssgfs4wpZPp2648QrxVPBFuXompBdpaugcfLmEHFCiSJtGRs2acGZc7aKVhq6UEmRYqk%2F7FvvkTV8n14EaMv75u9Di4kxma8VOSwgsKz1zJkiTvY6Dm5kbhV8pv8ck%2B1%2F9aqmBymlrMoD4VPXr%2FcU06MydQFrIm0rlUxvfeqYzaU1RucLEofLPpZFy4VPpnpPJbd0mqngYb76qLmExXff0%2FJXCdsJZYmFB3aCwXF4dp4dXdzNaYhqKCaVjjlT5GHyOpIxTceTtUd7DO39%2B27uUlJXmmODF04E%2BA0rTFJkjhs25JihNSDsMJpT6QFYolzyHn2c4eFsA%3D&id=mJA49J7FtzxdI9hhyED2Cw&_=1653386943551")
			.headers(headers_52),
            http("/api/services/app/Chat/GetUserChatFriendsWithSettings")
			.get("/api/services/app/Chat/GetUserChatFriendsWithSettings")
			.headers(headers_17),
            http("/api/services/app/TCMCases/GetAll?Filter=&EntityId=0&ShowAll=false&Sorting=lastModificationTime%20DESC&SkipCount=0&MaxResultCount=10")
			.get("/api/services/app/TCMCases/GetAll?Filter=&EntityId=0&ShowAll=false&Sorting=lastModificationTime%20DESC&SkipCount=0&MaxResultCount=10")
			.headers(headers_17)))
		.pause(6)
		.exec(http("/api/TokenAuth/LogOut?d=1653386950655")
			.options("/api/TokenAuth/LogOut?d=1653386950655")
			.headers(headers_14)
			.resources(http("/api/TokenAuth/LogOut?d=1653386950655")
			.get("/api/TokenAuth/LogOut?d=1653386950655")
			.headers(headers_15),
            http("request_83")
			.get(uri2 + "/")
			.headers(headers_0),
            http("/assets/appconfig.production.json?d=1653386951996")
			.get(uri2 + "/assets/appconfig.production.json?d=1653386951996")
			.headers(headers_1),
            http("/AbpUserConfiguration/GetAll?d=1653386952134")
			.options("/AbpUserConfiguration/GetAll?d=1653386952134")
			.headers(headers_2),
            http("/AbpUserConfiguration/GetAll?d=1653386952134")
			.get("/AbpUserConfiguration/GetAll?d=1653386952134")
			.headers(headers_3),
            http("/api/services/app/Session/GetCurrentLoginInformations")
			.options("/api/services/app/Session/GetCurrentLoginInformations")
			.headers(headers_4),
            http("/api/services/app/Session/GetCurrentLoginInformations")
			.get("/api/services/app/Session/GetCurrentLoginInformations")
			.headers(headers_5)))
		.pause(1)
		.exec(http("/api/TokenAuth/GetExternalAuthenticationProviders")
			.options("/api/TokenAuth/GetExternalAuthenticationProviders")
			.headers(headers_4)
			.resources(http("/api/TokenAuth/GetExternalAuthenticationProviders")
			.options("/api/TokenAuth/GetExternalAuthenticationProviders")
			.headers(headers_4),
            http("/api/TokenAuth/GetExternalAuthenticationProviders")
			.get("/api/TokenAuth/GetExternalAuthenticationProviders")
			.headers(headers_5),
            http("/api/TokenAuth/GetExternalAuthenticationProviders")
			.get("/api/TokenAuth/GetExternalAuthenticationProviders")
			.headers(headers_5)))

	setUp(scn.inject(atOnceUsers(10))).protocols(httpProtocol)
}