import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-listas_de_reproduccion_ajenas';
import './vista-canciones_mas_escuchadas';
import './vista-artistas_similares';
import './vista-lista_album';
import './vista-listas_de_reproduccion_propias';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-perfil_artista_comun')
export class VistaPerfil_artista_comun extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" style="width: 100%;background-color: var(--lumo-contrast-10pct);" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;" id="vaadinHorizontalLayout">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; align-self: center; align-items: center; width: fit-content;" id="vaadinVerticalLayout2">
    <img style="width: 200px; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l);" src="https://i.scdn.co/image/ab6761610000e5eb6ad57a3cb26ae3ffd0f28f22" id="img">
    <vaadin-button id="vaadinButton">
      Editar 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 50%;" id="vaadinVerticalLayout3">
    <vaadin-horizontal-layout style="width: 100%; justify-content: space-between;" id="vaadinHorizontalLayout1">
     <h5 style="margin-top: 40px;" id="h5">Bad Bunny</h5>
     <vaadin-button style="margin-right: 10%;" id="vaadinButton1">
       Dejar de seguir 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center;" id="vaadinHorizontalLayout2">
     <h5 id="h51">bbunny@gmail.com</h5>
     <vaadin-button id="vaadinButton2">
       Editar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="vaadinVerticalLayout4">
    <h5 id="h52">Seguidores</h5>
    <h5 id="h53">80000000</h5>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="vaadinVerticalLayout5">
    <h5 id="h54">Seguidos</h5>
    <h5>10</h5>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-button style="align-self: flex-end; margin: var(--lumo-space-m);" id="vaadinButton3">
    Recibir notificaciones 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-start;background-color: var(--lumo-contrast-10pct);" id="vaadinHorizontalLayout3">
  <vista-listas_de_reproduccion_propias style="margin-left: var(--lumo-space-xl);" id="vistaListas_de_reproduccion_propias"></vista-listas_de_reproduccion_propias>
  <vaadin-button style="margin: var(--lumo-space-m);">
    Crear una nueva lista 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-end; align-self: flex-start; width: 100%;background-color: var(--lumo-contrast-10pct);">
  <vista-listas_de_reproduccion_ajenas style="width: 100%; margin-left: var(--lumo-space-xl);" id="vistaListas_de_reproduccion_ajenas"></vista-listas_de_reproduccion_ajenas>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;background-color: var(--lumo-contrast-10pct);" id="vaadinHorizontalLayout4">
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout6">
   <vista-canciones_mas_escuchadas style="align-self: center; padding: var(--lumo-space-l);" id="vistaCanciones_mas_escuchadas"></vista-canciones_mas_escuchadas>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout7">
   <vista-artistas_similares style="align-self: center; padding: var(--lumo-space-l);" id="vistaArtistas_similares"></vista-artistas_similares>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout8">
   <vista-lista_album style="align-self: center; padding: var(--lumo-space-l);" id="vistaLista_album"></vista-lista_album>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;background-color: var(--lumo-contrast-10pct);" id="vaadinVerticalLayout9">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout5">
   <vaadin-horizontal-layout style="width: 100%; margin-left: var(--lumo-space-xl);" id="vaadinHorizontalLayout6">
    <h2 style="margin-top: var(--lumo-space-xl); margin-right: var(--lumo-space-l); margin-left: var(--lumo-space-l); align-self: center;" id="h2">Festivales y Conciertos</h2>
    <vaadin-button style="margin-top: var(--lumo-space-xl);" id="vaadinButton4">
      Añadir 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout7">
   <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout10">
    <vaadin-horizontal-layout style="object-fit: cover; margin: var(--lumo-space-l); align-self: center;" id="vaadinHorizontalLayout8">
     <img style="width: 150px;" src="https://cdn-icons-png.flaticon.com/512/42/42956.png" id="img1">
     <vaadin-vertical-layout style="justify-content: space-around; margin-left: var(--lumo-space-l); align-self: center;" id="vaadinVerticalLayout11">
      <h5 id="h55">1.00</h5>
      <h5 id="h56">Capital One Arena</h5>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="object-fit: cover; margin: var(--lumo-space-l); align-self: center;" id="vaadinHorizontalLayout9">
     <img style="width: 150px;" src="https://cdn-icons-png.flaticon.com/512/42/42956.png" id="img2">
     <vaadin-vertical-layout style="justify-content: space-around; margin-left: var(--lumo-space-l);" id="vaadinVerticalLayout12">
      <h5 id="h57">1.00</h5>
      <h5 id="h58">State Farm Arena</h5>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout13">
    <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout14">
     <vaadin-horizontal-layout style="object-fit: cover; margin: var(--lumo-space-l); align-self: center;" id="vaadinHorizontalLayout10">
      <img style="width: 150px;" src="https://cdn-icons-png.flaticon.com/512/42/42956.png" id="img3">
      <vaadin-vertical-layout style="justify-content: space-around; margin-left: var(--lumo-space-l);" id="vaadinVerticalLayout15">
       <h5 id="h512">1.00</h5>
       <h5 id="h59">Spectrum Center</h5>
      </vaadin-vertical-layout>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout style="object-fit: cover; margin: var(--lumo-space-l); align-self: center;" id="vaadinHorizontalLayout11">
      <img style="width: 150px;" src="https://cdn-icons-png.flaticon.com/512/42/42956.png" id="img4">
      <vaadin-vertical-layout style="justify-content: space-around; margin-left: var(--lumo-space-l);" id="vaadinVerticalLayout16">
       <h5 id="h510">2.00</h5>
       <h5 id="h511">Amway Center</h5>
      </vaadin-vertical-layout>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;" id="vaadinHorizontalLayout12">
  <vaadin-button style="margin: var(--lumo-space-m);" id="vaadinButton5">
    Darse de baja 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
