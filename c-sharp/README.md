
# HelloWorld - C#


install [.NET Core SDK](https://download.microsoft.com/download/0/F/D/0FD852A4-7EA1-4E2A-983A-0484AC19B92C/dotnet-sdk-2.0.0-osx-gs-x64.pkg)

```bash
cd src/HelloWorld
dotnet new console
cd ../../test/HelloWorldTest
dotnet new xunit
dotnet add reference ../../src/HelloWorld/HelloWorld.csproj
```

run with `dotnet run`

